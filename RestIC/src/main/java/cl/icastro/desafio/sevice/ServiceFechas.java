package cl.icastro.desafio.sevice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.icastro.desafio.vo.DatosVO;
import cl.icastro.desafio.vo.RetornoVO;

@RestController
@RequestMapping(path="/DesafioPrevired")
public class ServiceFechas {

	@RequestMapping(
			method=RequestMethod.POST,
			path="fechasFaltantes",
			consumes="application/json",
			produces="application/json")
	public @ResponseBody RetornoVO validarRangoFechas(@RequestBody DatosVO vo) {
		RetornoVO ret = new RetornoVO();
		try {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			List<String> fechasFaltantes = new ArrayList<>();
			List<Date> listaPeriodos = periodosCreacionFin(df.parse(vo.getFechaCreacion()), df.parse(vo.getFechaFin()));
			for (Date fechaLista : listaPeriodos) {
				boolean existe = false;
				for (String fecha : vo.getFechas()) {
					if (fechaLista.compareTo(df.parse(fecha)) == 0)
						existe = true;
				}
				if (!existe) {
					fechasFaltantes.add(df.format(fechaLista));
				}
			}
			ret.setId(vo.getId());
			ret.setFechaCreacion(vo.getFechaCreacion());
			ret.setFechaFin(vo.getFechaFin());
			ret.setFechasFaltantes(fechasFaltantes);
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}

		return ret;
	}

	/**
	 * Metodo que determina los periodos entre fechaCreacion y fechaFin
	 * 
	 * @param fechaCreacion (Date)
	 * @param fechaFin (Date)
	 * @return List<Date> lista de periodos
	 */
	public static List<Date> periodosCreacionFin(Date fechaCreacion, Date fechaFin) {
		Date fechaPeriodo = fechaCreacion;
		List<Date> lista = new ArrayList<>();
		do {
			Date fecha = new Date();
			fecha.setTime(fechaPeriodo.getTime());
			lista.add(fecha);

			Calendar cal = Calendar.getInstance();
			cal.setTime(fechaPeriodo);
			cal.add(Calendar.MONTH, 1);
			fechaPeriodo.setTime(cal.getTime().getTime());
		} while (fechaFin.compareTo(fechaCreacion) >= 0);

		return lista;
	}

}
