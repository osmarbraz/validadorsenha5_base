package senha;

public class Senha {

    private String senha;

    /**
     * Construtor sem argumento.
     */
    public Senha() {
        this("");
    }

    /**
     * Construtor com argumento.
     *
     * @param senha Um senha.     
     */
    public Senha(String senha) {
        setSenha(senha);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Verifica se o senha é válida.
     *
     * @return Um lógico se é ou não uma senha válida.
     */
    public boolean eValida() {            

        return true;
    }   
 }
