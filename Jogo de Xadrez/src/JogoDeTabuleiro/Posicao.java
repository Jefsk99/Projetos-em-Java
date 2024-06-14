package JogoDeTabuleiro;

public class Posicao {
 private int coluna;
 private int linhas;
 
    public Posicao(int coluna, int linhas) {
        this.coluna = coluna;
        this.linhas = linhas;
    }
    public int getColuna() {
        return coluna;
    }
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    public int getLinhas() {
        return linhas;
    }
    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }
    @Override
    public String toString(){
     return linhas + " , " + coluna;
    }
}
