public class Teste {
    public static void main(String[] args){


        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("1235456456");
        g1.setSalario(5000.0);
        g1.setSenha(2222);

        Administrador a1 = new Administrador();
        a1.setNome("Marco");
        a1.setCpf("1235456456");
        a1.setSalario(5000.0);
        a1.setSenha(222);

        Funcionario ev = new EditorVideo();
        ev.setSalario(2500);

        Funcionario d1 = new Designer();
        d1.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d1);


        System.out.println(controle.getSoma());

        SistemaInterno si = new SistemaInterno();
        si.autentica(g1);
        si.autentica(a1);


    }
}
