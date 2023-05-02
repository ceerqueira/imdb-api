import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String apiKey ="k_12345678";
        ImdbApiClient imdbApiClient = new ImdbApiClient(apiKey);
        //acessa a URL

        String json = imdbApiClient.getBody();

       //System.out.println(json);


        String jsonFilmes = json.substring(10, 92724);
        String []jsonsubFilmes = jsonFilmes.split("\\},\\{");

        RecebeJson recebeJson = new RecebeJson();
        List<Filme> listaFilme = new ArrayList<>();

        for (String a:jsonsubFilmes){
            Filme filme = new Filme();
            recebeJson.recebeTexto(a);
            filme.setTitulo(recebeJson.setTitles());
            filme.setUrlImagem(recebeJson.seturlImages());
            filme.setAno(Integer.parseInt(recebeJson.setYaer()));
            filme.setNota(Double.parseDouble(recebeJson.setimDbRating()));
            listaFilme.add( filme);
        }

        // Ordernar por Nome, e pode se alterar para outros tipos de ordenaçøes 
        Collections.sort(listaFilme);
        PrintWriter writer = new PrintWriter("content.html");

        new HttpGenerator(writer).generate(listaFilme); //movies é um List<Movie>

        writer.close();

    }
}
