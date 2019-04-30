package JogoCraps;

public class Dados {

    private int dado1;
    private int dado2;
    private int soma;
    private int mn;
    private Boolean verdade = false;

    public Dados(int dado1, int dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
        this.soma = 0;
    }


	public void setDado1(int dado1) {
        this.dado1 = dado1;
    }
	public int getMn() {
		return this.mn;
	}

    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }

    public int getDado1() {
        return dado1;
    }

    public int getDado2() {
        return dado2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma() {
        this.soma = this.dado1 + this.dado2;
    }

    public Boolean getVerdade() {
        return verdade;
    }

    public Boolean primeiroGanho() {
        if (this.soma == 7 || this.soma == 11) {
            this.verdade = true;
        }
        else {
        	this.verdade = false;
        }
        return this.verdade;
    }

    public Boolean primeiraPerda() {
        Boolean verdade = false;
        if (this.soma == 2 || this.soma == 3 || this.soma == 12) {
            verdade = true;
        }
        return verdade;
    }

    public void seteLance() {
        if (this.soma == 7) {
            System.out.println("Perda na segundo lance");
        }
    }

    public int lancesSeq(int soma) {
        if (this.soma != 7 && this.soma != 11 && this.soma != 2 && this.soma != 3 && this.soma != 12) {
            if (this.soma == soma) {
                this.mn = 1;
            }
            else {
            	this.mn = 5;
            }
        }
        return this.mn;
    }
}