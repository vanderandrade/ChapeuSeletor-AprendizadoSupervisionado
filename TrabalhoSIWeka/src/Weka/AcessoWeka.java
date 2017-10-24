package Weka;

import weka.core.Instances;
import weka.core.Instance;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.trees.J48;
import weka.classifiers.lazy.IBk;
import weka.core.Attribute;
import weka.core.DenseInstance;

public class AcessoWeka {

    private final String caminhoDados;
    private Instances dados;

    public AcessoWeka(String caminhoDados) {
        this.caminhoDados = caminhoDados;
    }

    public void leDados() throws Exception {
        DataSource fonte = new DataSource(caminhoDados);

        dados = fonte.getDataSet();
        if (dados.classIndex() == -1) {
            dados.setClassIndex(dados.numAttributes() - 1);
        }
    }

    public void imprimeDados() {
        for (int i = 0; i < dados.numInstances(); i++) {
            Instance atual = dados.instance(i);
            System.out.println((i + 1) + ": " + atual + "\n");
        }
    }

    public String arvoreDeDecisaoJ48(int[] valores) throws Exception {
        leDados();

        J48 tree = new J48();
        tree.buildClassifier(dados);

        Instance novaInstancia = new DenseInstance(16);
        novaInstancia.setDataset(dados);

        for (int i = 0; i < 15; i++) {
            novaInstancia.setValue(i, valores[i]);
        }

        novaInstancia.setValue(15, "sonserina"); // casa
        double pred = tree.classifyInstance(novaInstancia);
        Attribute a = dados.attribute(15);

        return a.value((int) pred);
    }

    public String InstanceBased(int[] valores) throws Exception {
        leDados();

        IBk k3 = new IBk(5);
        k3.buildClassifier(dados);

        Instance novaInstancia = new DenseInstance(16);
        novaInstancia.setDataset(dados);

        for (int i = 0; i < 15; i++) {
            novaInstancia.setValue(i, valores[i]);
        }

        novaInstancia.setValue(15, "sonserina"); // casa
        double pred = k3.classifyInstance(novaInstancia);
        Attribute a = dados.attribute(15);

        return a.value((int) pred);
    }
}
