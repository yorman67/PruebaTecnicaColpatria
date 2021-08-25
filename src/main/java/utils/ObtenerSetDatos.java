package utils;

import model.DatosCsv;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ObtenerSetDatos {


    private ObtenerSetDatos() {
    }

    public static DatosCsv extraerDatos(String strEscenario, String strRutaArchivo, String strNombreHoja) {
        DatosCsv datos = new DatosCsv();
        Sheet datosHojaExcel = Comunes.obtenerDatosHojaExcel(strRutaArchivo, strNombreHoja);
        Row filaDatosHojaExcel = null;
        for (int i = 1; i <= datosHojaExcel.getLastRowNum(); i++) {
            filaDatosHojaExcel = datosHojaExcel.getRow(i);
            if (Comunes.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 0).equals(strEscenario)) {
                if(strRutaArchivo.contains("EliminarData")){
                    datos.setCorreo(Comunes.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 1));
                }else{
                    datos.setFecha(Comunes.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 1));
                    datos.setFechaHora(Comunes.obtenerValorStringCeldaExcel(filaDatosHojaExcel, 2));
                }
            }
        }
        return datos;
    }


}
