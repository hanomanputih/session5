import java.util.ArrayList;
import java.util.List;

/**
 * Created by IvanAdhi on 15/03/18.
 */
public class Main {
    //psvm
    public static void main(String[] args) {
        //Array
        String[] murid = {
          "Uray","Dinda","Ridho","Bastian","Bayu"
        };
        String[] murid2 = new String[2];
        murid2[0] = "Urray";
        murid2[1] = "Dinda";
//        murid2[2] = "lalala";

        //murid= [0]uray, [1]dinda
        System.out.println(murid2[0]);

        int[][] matrix = new int[2][2];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        System.out.println(matrix[0][1]);

        // 0   1
        // ..  ..


        //List
        List<BangunDatar> list = new ArrayList<BangunDatar>();

        List<Object> mentors = new ArrayList<Object>();
        mentors.add("ivan");
        mentors.add("rio");
        mentors.add(4);

        //pengecekan value
        System.out.println(mentors.contains("ivan"));


        BangunDatar lingkaran = new BangunDatar();
        lingkaran.nama="lingkaran kecil";
        mentors.add(lingkaran);

        //Casting
        BangunDatar test = (BangunDatar) mentors.get(3);
        System.out.println(test.nama);

        //If Else
        float ipk = 1.1f;
        if(ipk>=2.0 && ipk<=3.0){
            System.out.println("IPK LUMAYAN");
        }else if(ipk>3.0&&ipk<=4.0){
            System.out.println("GOOD JOB");
        }else{
            System.out.println("Seriusan??");
        }

        //Switch
        int pilihanMenu = 2;
        switch(pilihanMenu){
            case 1:
                System.out.println("Menu 1");
                break;
            case 2:
                System.out.println("Menu 2");
                break;
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }

        //for
        for(int i = 0;i < 5;i++){
            System.out.println("ini iterasi ke : " + i);
        }

        for (int i = 0; i < murid.length; i++) {
            System.out.println(murid[i]);
        }

//        int i = 0;
//        for(;;){
//            System.out.println(i);
//            //garbage collection
//            murid = null;
//            System.gc();
//            i++;
//        }

        int x = 0;
        String[] lines = {"line 1","line 2", "line 3"};
        String[] noLine = {};
        //while
        do{
            if(x == 0) {
                System.out.println("HEADER");
            }else{
                System.out.println(noLine[x-1]);
            }
            x++;
        }while (x<noLine.length+1);

        //fungsinya sama dengan for
        int y = 5;

        while(y<lines.length){
            System.out.println(lines[y]);
            y++;
        }

        y = 0;
        boolean ketemu = false;
        String dataCari = "LINE 2";
        while (!ketemu){
            if(lines[y].equalsIgnoreCase(dataCari)){
                ketemu = true;
                System.out.println("ketemu di index: " + y);
            }
            y++;
        }

    }
}
