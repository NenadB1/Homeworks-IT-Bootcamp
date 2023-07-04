import com.github.javafaker.Faker;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) throws IOException {

        try {

            Faker faker = new Faker();
            ArrayList<String> names = new ArrayList<>();

            FileInputStream inputStream = new FileInputStream("names.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFRow row = sheet.getRow(0);
            XSSFSheet sheet1 = workbook.createSheet();
            XSSFRow row1 = sheet1.createRow(0);

            for (int i = 0; i < 5; i++) {
                XSSFCell cell = row.getCell(i);

                names.add(cell.getStringCellValue());

            }

            for (int i = 0; i < 5; i++) {
                names.add(faker.name().firstName().toString());
            }

            for (int i = 0; i < 10; i++) {
                XSSFCell cell = row1.createCell(i);
                cell.setCellValue(names.get(i));
            }

            FileOutputStream outputStream = new FileOutputStream("names.xlsx");
            workbook.write(outputStream);
            outputStream.close();

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
