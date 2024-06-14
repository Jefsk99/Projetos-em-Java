package JogoDeTabuleiro;

public class Tabuleiro {
    private int coluna;
    private int linhas;
    private Pecas[][] pecas;

    public Tabuleiro(int linhas, int coluna) {
        this.coluna = coluna;
        this.linhas = linhas;
        pecas = new Pecas[linhas][coluna];
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

    

    
}
