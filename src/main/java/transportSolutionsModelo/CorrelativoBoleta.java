
package transportSolutionsModelo;

public class CorrelativoBoleta {
    
    private String serie;
    private String codigo;

    public CorrelativoBoleta() {
    }

    public CorrelativoBoleta(String serie, String codigo) {
        this.serie = serie;
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }   
}
