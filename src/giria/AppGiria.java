package giria;

import java.util.ArrayList;
import java.util.List;

public class AppGiria {
    public static void main(String[] args) throws Exception {
       
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Paulista());
        pessoas.add(new Mineiro());
        pessoas.add(new Carioca());
        pessoas.add(new Paulista());
        pessoas.add(new Mineiro());
        pessoas.add(new Carioca());

        System.out.println("Fala aí gente!");
        pessoas.stream().forEach(a -> System.out.println(a.giria()));
    }
}
