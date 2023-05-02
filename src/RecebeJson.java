public class RecebeJson {

    String textoJson;
    int posicaoInicio,posicaoFim;

    public void recebeTexto(String texto){
        this.textoJson = texto;
    }
    public String setTitles(){
        posicaoInicio=8+ textoJson.indexOf("title");
        posicaoFim= textoJson.indexOf(",",10+posicaoInicio)-1;
        return textoJson.substring(posicaoInicio, posicaoFim);
    }
    public String seturlImages(){
        posicaoInicio=8+ textoJson.indexOf("image");
        posicaoFim= textoJson.indexOf(",",posicaoInicio)-1;
        return textoJson.substring(posicaoInicio, posicaoFim);
    }
    public String setYaer(){
        posicaoInicio= 7+ textoJson.indexOf("year");
        posicaoFim= textoJson.indexOf(",",posicaoInicio)-1;
        return textoJson.substring(posicaoInicio, posicaoFim);
    }
    public String setimDbRating(){
        posicaoInicio= 13+ textoJson.indexOf("imDbRating");
        posicaoFim= textoJson.indexOf(",",posicaoInicio)-1;
        return textoJson.substring(posicaoInicio, posicaoFim);
    }
    
}
