package universidade;

public class Estudante {
    private String nome;
    private String ra;
    private double[] notas;

    /**
     * Constroi um novo estudante
     * 
     * @param nome O nome completo do estudante
     * @param ra O RA no formato UFABC
     * @param notas As notas obtidas de 0 a 10
     */

    public Estudante(String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    private double somaNotas() {
        double soma = 0.0;

        for (var nota : notas) {
            soma += nota;
        }

        return soma;
    }

    public double getMedia() {
        if (notas.length == 0){
            return 0.0;
        }

        return somaNotas() / notas.length;
    }
    
}