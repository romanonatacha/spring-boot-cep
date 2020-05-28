package br.com.consulta.cep.dto.request;

import br.com.consulta.cep.model.Cep;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepRequestDTO {
    private String cep;
    private String largadouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String unidade;
    private String ibge;

    public Cep build() {
        Cep cep = new Cep()
                .setCep(this.cep)
                .setBairro(this.bairro)
                .setComplemento(this.complemento)
                .setIbge(this.ibge)
                .setUnidade(this.unidade)
                .setLargadouro(this.largadouro)
                .setLocalidade(this.localidade)
                .setUf(this.uf);

        return  cep;
    }
}
