package utils;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Level;

import static utils.enums.EnumConstantes.LOGGERCOLPATRIA;

public class Comunes {

    public static Sheet obtenerDatosHojaExcel(String strRutaArchivo, String strNombreHoja) {
        Sheet hojaExcel = null;
        try {
            InputStream archivoExcel = new FileInputStream(strRutaArchivo);
            Workbook libroExcel = WorkbookFactory.create(archivoExcel);
            hojaExcel = libroExcel.getSheet(strNombreHoja);
            LOGGERCOLPATRIA.log(Level.INFO,"se obtuvieron los datos de las hojas");
        } catch (Exception e) {
            LOGGERCOLPATRIA.log(Level.SEVERE, e.getMessage());
        }
        return hojaExcel;
    }

    public static String obtenerValorStringCeldaExcel(Row filaArchivo, Integer columnaArchivo) {
        String strValorCelda = "";
        try {
            strValorCelda = filaArchivo.getCell(columnaArchivo).getStringCellValue();
        } catch (NullPointerException |IllegalStateException e) {
            strValorCelda = String.format("%.0f", new Double(filaArchivo.getCell(columnaArchivo).getNumericCellValue()));
        }
        return strValorCelda.trim();
    }


}
