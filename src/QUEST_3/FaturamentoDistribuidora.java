package QUEST_3;

/**
 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora,
 * faça um programa, na linguagem que desejar, que calcule e retorne:
 • O menor valor de faturamento ocorrido em um dia do mês;
 • O maior valor de faturamento ocorrido em um dia do mês;
 • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
*/

 import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class FaturamentoDistribuidora {
    private List<Diaria> diarias;
    private double mediaMensal;

    public FaturamentoDistribuidora(String jasonPath) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(jasonPath)) {
            Type listType = new TypeToken<List<Diaria>>() {}.getType();
            this.diarias = gson.fromJson(reader, listType);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getMaoirFaturamento() {
        Diaria max = Collections.max(diarias, Comparator.comparing(Diaria::getValor));
        return "Dia "+max.getDia()+" com valor de R$ "+max.getValor();
    }

    public String getMenorFaturamento() {
        Diaria min = Collections.max(diarias, Comparator.comparing(Diaria::getValor));
        for (Diaria diaria : diarias) {
            Diaria aux;
            if (diaria.getValor() > 0.0) {
                aux = diaria;
                if (aux.getValor() < min.getValor())
                    min = aux;
            }
        }

        return "Dia "+min.getDia()+" com valor de R$ "+min.getValor();
    }

    public String diasValorMaiorQueMedia() {
        int dias = 0;
        double media = getMediaMensal();
        for (Diaria diaria : diarias) {
            if (diaria.getValor() > media)
                dias++;
        }
        return "Em "+dias+" dias, o faturamento foi maior que a média de "+media;
    }
    private void setMediaMensal() {
        double dias = 0.0;
        for (Diaria diaria : this.diarias) {
            if (diaria.getValor() > 0.0) {
                dias += 1;
                this.mediaMensal += diaria.getValor();
            }
        }
        this.mediaMensal = this.mediaMensal/dias;
    }

    private double getMediaMensal() {
        setMediaMensal();
        return this.mediaMensal;
    }

}
