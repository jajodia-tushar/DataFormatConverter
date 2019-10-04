package app;

import com.tavisca.dataconversion.converter.CSVConverter;
import com.tavisca.dataconversion.converter.JSONConverter;
import com.tavisca.dataconversion.converter.XMLConverter;
import com.tavisca.dataconversion.data.MysqlRepository;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MysqlRepository mysqlRepository = new
                MysqlRepository();
        Scanner in = new
                Scanner(System.in);
        while(true){

            System.out.println("1. Get The Data In JSON Format\n" +
                               "2. Get The Data In XML Format\n" +
                               "3. Get The Data in CSV Format\n" +
                               "4. Exit \n" );

            int option = in.nextInt();

            switch (option){
                case 1 :{
                    String jsonFormat = JSONConverter.getJSONFormat(mysqlRepository.getAllEmployee());
                    System.out.println(jsonFormat+"\n\n\n");
                    break;
                }

                case 2 :{
                    String xmlFormat = XMLConverter.getXMLFormat(mysqlRepository.getAllEmployee());
                    System.out.println(xmlFormat+"\n\n\n");
                    break;
                }

                case 3 :{
                    String csvFormat = CSVConverter.getCSVFormat(mysqlRepository.getAllEmployee());
                    System.out.println(csvFormat+"\n\n\n\n");
                    break;
                }

                case 4 :{
                    System.out.println("----------------------Thank You ---------------------------");
                    return;
                }

                default: {
                    System.out.println("Make a Valid Selection ");
                }
            }
        }
    }
}


