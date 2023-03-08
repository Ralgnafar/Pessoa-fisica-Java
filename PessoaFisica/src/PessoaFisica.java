public class PessoaFisica {
    
    private String nome;
    private String ultimoNome;
    private char genero;
    private int idade;
    private String CPF;
    private String estadoCivil;
    private String CEP;
    
    public PessoaFisica(String nome, String ultimoNome, char genero, int idade, String CPF, String estadoCivil, String CEP) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.genero = genero;
        this.idade = idade;
        this.CPF = CPF;
        this.estadoCivil = estadoCivil;
        setCEP(CEP);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getUltimoNome() {
        return ultimoNome;
    }
    
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    
    public char getGenero() {
        return genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getEstadoCivil() {
        return estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getCEP() {
        return CEP;
    }
    
    public void setCEP(String CEP) {
        if (CEP.matches("\\d{8}")) {
            this.CEP = CEP;
        } else {
            throw new IllegalArgumentException("CEP deve conter 8 dígitos numéricos.");
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PessoaFisica) {
            PessoaFisica outraPessoa = (PessoaFisica) obj;
            return this.CPF.equals(outraPessoa.CPF);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return CPF.hashCode();
    }
    
    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", ultimoNome='" + ultimoNome + '\'' +
                ", genero=" + genero +
                ", idade=" + idade +
                ", CPF='" + CPF + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", CEP='" + CEP + '\'' +
                '}';
    }
}