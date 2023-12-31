package br.com.vanilzasilvestre.projetoClinicaOdontologica.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id")
    private UUID id;
    private String nome;
    private LocalDate dataNascimento;
    private SexoEnum sexo;
    @Column(updatable = false)
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco" , referencedColumnName = "id", foreignKey = @ForeignKey(name="fk_paciente_endereco"))
    private Endereco endereco;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contato" , referencedColumnName = "id", foreignKey = @ForeignKey(name="fk_paciente_contato"))
    private Contato contato;

    @PrePersist
    public void naCriacao() {
        this.createdAt = LocalDateTime.now();
    }
    @PreUpdate
    public void naAtualizacao() {
        this.updateAt = LocalDateTime.now();
    }

}
