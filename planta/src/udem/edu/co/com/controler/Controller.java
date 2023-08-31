package udem.edu.co.com.controler;

import udem.edu.co.com.modelo.entity.Cebolla;
import udem.edu.co.com.modelo.entity.Lechuga;
import udem.edu.co.com.modelo.entity.Remolachas;
import udem.edu.co.com.modelo.interfac.Alimento;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void lista() {

        List <Alimento> alimentos =new ArrayList<>();
        alimentos.add(new Remolachas(" messi", 34, 3));
        alimentos.add(new Cebolla("messi2", 2, "god",2));
        alimentos.add(new Lechuga("cr",2, "3",2));
        System.out.printf(alimentos.toString());




    }



}
