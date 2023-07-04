import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Zadatak1 {
    public static void main(String[] args) throws IOException {

       try {

           FileInputStream fis = new FileInputStream("test.xlsx");
           XSSFWorkbook workbook = new XSSFWorkbook(fis);
           XSSFSheet sheet = workbook.getSheetAt(0);
           XSSFSheet sheet1 = workbook.createSheet();
           XSSFRow row1 = sheet1.createRow(0);

           double sum = 0;


           for (int i = 0; i < 3; i++) {
               XSSFRow row = sheet.getRow(i);

               sum = 0;
               for (int j = 0; j < 5; j++) {
                   XSSFCell cell = row.getCell(j);

                   double value = cell.getNumericCellValue();
                   sum += value;

                   XSSFCell avgCell = row1.createCell(i);
                   avgCell.setCellValue(sum / 5);

               }
           }

           FileOutputStream fos = new FileOutputStream("test.xlsx");
           workbook.write(fos);
           fos.close();

       } catch (IOException ex) {
           ex.printStackTrace();
       }
    }
}
