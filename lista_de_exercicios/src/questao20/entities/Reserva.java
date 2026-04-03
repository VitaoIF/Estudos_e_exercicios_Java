package questao20.entities;

import questao20.exceptions.DomainException;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Integer numeroQuarto;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Reserva() {
    }

    public Reserva(LocalDate checkIn, LocalDate checkOut, Integer numeroQuarto) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numeroQuarto = numeroQuarto;
    }

    public Long duracao(){
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void atualizarDatas(LocalDate checkIn, LocalDate checkOut) throws DomainException{
        LocalDate hoje = LocalDate.now();
        if (checkIn.isBefore(hoje) || checkOut.isBefore((hoje))){
            throw new DomainException("Erro na reserva: preciso de datas futuras para atualização");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Erro na reserva! A data do check-out deve ser depois da data do check-in");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    @Override
    public String toString(){
        return "Quarto "
                + numeroQuarto
                + ", check-in: "
                + checkIn.format(formatter)
                + ", check-out: "
                + checkOut.format(formatter)
                + ", "
                + duracao()
                + " noites";
    }
}
