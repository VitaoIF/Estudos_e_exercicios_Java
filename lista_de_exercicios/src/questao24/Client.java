package questao24;

import java.util.Objects;

public class Client {
    private String nome;
    private String email;

    public Client(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    public Client() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;
        return Objects.equals(nome, client.nome) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + Objects.hashCode(email);
        return result;
    }
}
