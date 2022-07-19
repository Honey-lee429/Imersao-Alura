import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class AppJava {

    public static void main(String[] args) throws IOException, InterruptedException {
        //fazer uma conexão HHTP e buscar os top 25 filmes
        String url = "https://alura-filmes.herokuapp.com/conteudos";
        URI address = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        //pegar só os dados que interessam (titulo, imagem, rate)
        //exibir e manipular os dados

    }
}
