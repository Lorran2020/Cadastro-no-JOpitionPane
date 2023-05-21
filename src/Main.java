import javax.swing.JOptionPane;
//importar a biblioteca JOptionPane
public class Main {
    //classe publica
    public static void main(String[] args) {
        //linha de execução
        int noOption = JOptionPane.NO_OPTION;
        int okOption = JOptionPane.OK_OPTION;
        String pol = JOptionPane.showInputDialog(null,
                "Digite <Cadastro> \npara verificarmos se nao e um robo", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        int conf = JOptionPane.showConfirmDialog(null,
                "Verifique se digitou <Cadastro> corretamente" + "\nsua digitação " + "<" + pol + ">");
        //confirmar a palavra
        //cofirmação para nao ser um robo
        if (conf == okOption) {
            System.out.println(pol);
            // impreção no monitor serial
            String email = JOptionPane.showInputDialog(null,
                    "Digite seu email", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            int email1 = JOptionPane.showConfirmDialog(null,
                    "Verifique se o seu email esta correto" + "\n<" + email + ">");
            if (email1 == okOption) {
                //JOpitionPane para digitare verificar email
                System.out.println(email);
                //emprime o email no monitor serial
                String senha = JOptionPane.showInputDialog(null,
                        "Crie uma senha para você", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                if (JOptionPane.showConfirmDialog(null,
                        "Você deseja continuar com essa senha?" + "\n<" + senha + ">") == okOption) {
                    System.out.println(senha);
                    //JOpitioPane para criar uma senha
                    //sout, imprime no monitor serial
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                    if (idade <= 10) {
                        //categoria por idade
                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                        System.out.println("Categoria Criança");
                        // imprime a categoria por idade
                        String user = JOptionPane.showInputDialog(null,
                                "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        int pp = JOptionPane.showConfirmDialog(null,
                                "Confirme se seu nome esta correto" + "\n<" + user + ">");
                        if (pp == okOption) {
                            JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                            + "\nSeu email: " + email + "\nSua senha: " + senha +
                                            "\nSeu nome: " + user + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        } else if (pp == noOption) {
                            String user1 = JOptionPane.showInputDialog(null,
                                    "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int pp1 = JOptionPane.showConfirmDialog(null,
                                    "Confirme se seu nome esta correto" + "\n<" + user1 + ">");
                            if (pp1 == okOption) {
                                JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                "\nSeu nome: " + user1 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Voce excedeu o numero limite de tentativas " +
                                                "\n Tente novamente");
                                System.out.println("Cadastro cacelado");
                            }
                        }
                    } else if (idade <= 17) {
                        //categorize por idade
                        JOptionPane.showMessageDialog(null,
                                "Voce foi adicionado a categoria adolescente");
                        System.out.println("Categoria Adoslecente");
                        // imprime a categoria por idade
                        String user2 = JOptionPane.showInputDialog(null,
                                "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        int pp2 = JOptionPane.showConfirmDialog(null,
                                "Confirme se seu nome esta correto" + "\n<" + user2 + ">");
                        if (pp2 == okOption) {
                            JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                            + "\nSeu email:" + email + "\nSua senha:" + senha +
                                            "\nSeu nome:" + user2 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        } else if (pp2 == noOption) {
                            String user3 = JOptionPane.showInputDialog(null,
                                    "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int pp3 = JOptionPane.showConfirmDialog(null,
                                    "Confirme se seu nome esta correto" + "\n<" + user3 + ">");
                            if (pp3 == okOption) {
                                JOptionPane.showMessageDialog(null,
                                        "Categoria: Criança " + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                "\nSeu nome: " + user3 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Voce excedeu o numero limite de tentativas " +
                                                "\n Tente novamente");
                                System.out.println("Cadastro cacelado");
                            }
                        }
                    } else if (idade <= 60) {
                        //categoria por idade
                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                        System.out.println("Categoria Adulto");
                        // imprime a categoria por idade
                        String user4 = JOptionPane.showInputDialog(null,
                                "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        int pp4 = JOptionPane.showConfirmDialog(null,
                                "Confirme se seu nome esta correto" + "\n<" + user4 + ">");
                        if (pp4 == okOption) {
                            JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                            + "\nSeu email:" + email + "\nSua senha:" + senha +
                                            "\nSeu nome:" + user4 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        } else if (pp4 == noOption) {
                            String user5 = JOptionPane.showInputDialog(null,
                                    "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int pp5 = JOptionPane.showConfirmDialog(null,
                                    "Confirme se seu nome esta correto" + "\n<" + user5 + ">");
                            if (pp5 == okOption) {
                                JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                "\nSeu nome: " + user5 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Voce excedeu o numero limite de tentativas " +
                                                "\n Tente novamente");
                                System.out.println("Cadastro cacelado");
                            }
                        }
                    } else if (idade <= 200) {
                        //categoria por idade
                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                        System.out.println("Categoria Idoso");
                        // imprime a categoria por idade
                        String user6 = JOptionPane.showInputDialog(null,
                                "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        int pp6 = JOptionPane.showConfirmDialog(null,
                                "Confirme se seu nome esta correto" + "\n<" + user6 + ">");
                        if (pp6 == okOption) {
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email: " + email +
                                            "\nSua senha: " + senha + "\nSeu nome: " + user6 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        } else if (pp6 == noOption) {
                            String user7 = JOptionPane.showInputDialog(null,
                                    "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int pp7 = JOptionPane.showConfirmDialog(null,
                                    "Confirme se seu nome esta correto" + "\n<" + user7 + ">");
                            if (pp7 == okOption) {
                                JOptionPane.showMessageDialog(null,
                                        "Categoria: Criança" + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                "\nSeu nome: " + user7 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Voce excedeu o numero limite de tentativas " +
                                                "\n Tente novamente");
                                System.out.println("Cadastro cacelado");
                            }
                        } else {
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Idade invalida");
                        }
                    } else if (JOptionPane.showConfirmDialog(null,
                            "Você deseja continuar com essa senha?" + "\n<" + senha + ">") == noOption) {
                        String senha1 = JOptionPane.showInputDialog(null,
                                "Crie uma senha novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        if (JOptionPane.showConfirmDialog(null,
                                "Voce deseja continuar com essa senha?" + "\n<" + senha1 + ">") == okOption) {
                            //execução de uma nova senha
                            System.out.println(senha1);
                            int idade1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                            if (idade1 <= 10) {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                                System.out.println("Categoria Criança");
                                // imprime a categoria por idade
                                String user8 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp8 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user8 + ">");
                                if (pp8 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                    + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                    "\nSeu nome: " + user8 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else if (pp8 == noOption) {
                                    String user9 = JOptionPane.showInputDialog(null,
                                            "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    int pp9 = JOptionPane.showConfirmDialog(null,
                                            "Confirme se seu nome esta correto" + "\n<" + user9 + ">");
                                    if (pp9 == okOption) {
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                        + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                        "\nSeu nome: " + user9 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Voce excedeu o numero limite de tentativas " +
                                                        "\n Tente novamente");
                                        System.out.println("Cadastro cacelado");
                                    }
                                }
                            } else if (idade1 <= 17) {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adolescente");
                                System.out.println("Categoria Adoslecente");
                                // imprime a categoria por idade
                                String user10 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp10 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user10 + ">");
                                if (pp10 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                    + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                    "\nSeu nome: " + user10 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else if (pp10 == noOption) {
                                    String user11 = JOptionPane.showInputDialog(null,
                                            "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    int pp11 = JOptionPane.showConfirmDialog(null,
                                            "Confirme se seu nome esta correto" + "\n<" + user11 + ">");
                                    if (pp11 == okOption) {
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                        + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                        "\nSeu nome: " + user11 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Voce excedeu o numero limite de tentativas " +
                                                        "\n Tente novamente");
                                        System.out.println("Cadastro cacelado");
                                    }
                                }
                            } else if (idade1 <= 60) {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null,
                                        "Voce foi adicionado a categoria adulto");
                                System.out.println("Categoria Adulto");
                                // imprime a categoria por idade
                                String user12 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp12 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user12 + ">");
                                if (pp12 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                    + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                    "\nSeu nome: " + user12 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else if (pp12 == noOption) {
                                    String user13 = JOptionPane.showInputDialog(null,
                                            "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    int pp13 = JOptionPane.showConfirmDialog(null,
                                            "Confirme se seu nome esta correto" + "\n<" + user13 + ">");
                                    if (pp13 == okOption) {
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                        + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                        "\nSeu nome: " + user13 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Voce excedeu o numero limite de tentativas " +
                                                        "\n Tente novamente");
                                        System.out.println("Cadastro cacelado");
                                    }
                                }
                            } else if (idade1 <= 200) {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                                System.out.println("Categoria Idoso");
                                // imprime a categoria por idade
                                String user14 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp14 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user14 + ">");
                                if (pp14 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                    + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                    "\nSeu nome: " + user14 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else if (pp14 == noOption) {
                                    String user15 = JOptionPane.showInputDialog(null,
                                            "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    int pp15 = JOptionPane.showConfirmDialog(null,
                                            "Confirme se seu nome esta correto" + "\n<" + user15 + ">");
                                    if (pp15 == okOption) {
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                        + "\nSeu email: " + email + "\nSua senha: " + senha +
                                                        "\nSeu nome: " + user15 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Voce excedeu o numero limite de tentativas " +
                                                        "\n Tente novamente");
                                        System.out.println("Cadastro cacelado");
                                    }
                                }
                            } else {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Idade invalida");
                            }
                        } else if (JOptionPane.showConfirmDialog(null,
                                "Voce deseja continuar com essa senha?" + "\n<" + senha1 + ">") == noOption) {
                            //variação com limite
                            JOptionPane.showMessageDialog(null,
                                    "Você Excedeu o numero de tentativas \nTente novamente mais tarde");
                            System.out.println("Cadastro cancelado");
                            //cancelamento do cadastro
                        }
                    }
                }
            } else if (email1 == noOption) {
                String email0 = JOptionPane.showInputDialog(null,
                        "Digite novamente seu email você tem mais 1 tentativas", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                int email2 = JOptionPane.showConfirmDialog(null,
                        "Verifique se o seu email esta correto" + "\n<" + email + ">");
                //digitou email errado
                if (email2 == okOption) {
                    //JOpitionPane para digitare verificar email
                    System.out.println(email0);
                    //emprime o email no monitor serial
                    String senha2 = JOptionPane.showInputDialog(null, "Crie uma senha para você",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    if (JOptionPane.showConfirmDialog(null, "Você deseja continuar com essa senha?"
                            + "\n<" + senha2 + ">") == okOption) {
                        System.out.println(senha2);
                        //JOpitioPane para criar uma senha
                        //sout, imprime no monitor serial
                        int idade2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                        if (idade2 <= 10) {
                            //categoria por idade
                            JOptionPane.showMessageDialog(null,
                                    "Voce foi adicionado a categoria criança");
                            System.out.println("Categoria Criança");
                            // imprime a categoria por idade
                            String user16 = JOptionPane.showInputDialog(null,
                                    "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int pp16 = JOptionPane.showConfirmDialog(null,
                                    "Confirme se seu nome esta correto" + "\n<" + user16 + ">");
                            if (pp16 == okOption) {
                                JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                + "\nSeu email: " + email + "\nSua senha: " + senha2 +
                                                "\nSeu nome: " + user16 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            } else if (pp16 == noOption) {
                                String user17 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp17 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user17 + ">");
                                if (pp17 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                    + "\nSeu email: " + email + "\nSua senha: " + senha2 +
                                                    "\nSeu nome: " + user17 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "Voce excedeu o numero limite de tentativas " +
                                                    "\n Tente novamente");
                                    System.out.println("Cadastro cacelado");
                                }
                            }
                        } else if (idade2 <= 17) {
                            //categoria por idade
                            JOptionPane.showMessageDialog(null,
                                    "Voce foi adicionado a categoria adolescente");
                            System.out.println("Categoria Adoslecente");
                            // imprime a categoria por idade
                            String user18 = JOptionPane.showInputDialog(null,
                                    "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int pp18 = JOptionPane.showConfirmDialog(null,
                                    "Confirme se seu nome esta correto" + "\n<" + user18 + ">");
                            if (pp18 == okOption) {
                                JOptionPane.showMessageDialog(null, "Categoria: Criança" +
                                                "\nSeu email: " + email + "\nSua senha: " + senha2 +
                                                "\nSeu nome: " + user18 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            } else if (pp18 == noOption) {
                                String user19 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp19 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user19 + ">");
                                if (pp19 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança" +
                                                    "\nSeu email: " + email + "\nSua senha: " + senha2 +
                                                    "\nSeu nome: " + user19 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "Voce excedeu o numero limite de tentativas " +
                                                    "\n Tente novamente");
                                    System.out.println("Cadastro cacelado");
                                }
                            }
                        } else if (idade2 <= 60) {
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                            System.out.println("Categoria Adulto");
                            // imprime a categoria por idade
                            String user20 = JOptionPane.showInputDialog(null, "Digie seu nome",
                                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int pp20 = JOptionPane.showConfirmDialog(null,
                                    "Confirme se seu nome esta correto" + "\n<" + user20 + ">");
                            if (pp20 == okOption) {
                                JOptionPane.showMessageDialog(null, "Categoria: Criança" +
                                                "\nSeu email: " + email + "\nSua senha: " + senha2 +
                                                "\nSeu nome: " + user20 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            } else if (pp20 == noOption) {
                                String user21 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp21 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user21 + ">");
                                if (pp21 == okOption) {
                                    JOptionPane.showMessageDialog(null,
                                            "Categoria: Criança" + "\nSeu email: " + email + "\nSua senha: " + senha2 +
                                                    "\nSeu nome: " + user21 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Voce excedeu o numero limite de tentativas " +
                                            "\n Tente novamente");
                                    System.out.println("Cadastro cacelado");
                                }
                            }
                        } else if (idade2 <= 200) {
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                            System.out.println("Categoria Idoso");
                            // imprime a categoria por idade
                            String user21 = JOptionPane.showInputDialog(null,
                                    "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int pp21 = JOptionPane.showConfirmDialog(null,
                                    "Confirme se seu nome esta correto" + "\n<" + user21 + ">");
                            if (pp21 == okOption) {
                                JOptionPane.showMessageDialog(null,
                                        "Categoria: Criança" + "\nSeu email: " + email + "\nSua senha: " + senha2 +
                                                "\nSeu nome: " + user21 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            } else if (pp21 == noOption) {
                                String user22 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp22 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user22 + ">");
                                if (pp22 == okOption) {
                                    JOptionPane.showMessageDialog(null,
                                            "Categoria: Criança " + "\nSeu email:" + email + "\nSua senha: " + senha2 +
                                                    "\nSeu nome: " + user22 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "Voce excedeu o numero limite de tentativas " +
                                                    "\n Tente novamente");
                                    System.out.println("Cadastro cacelado");
                                }
                            }
                        } else {
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Idade invalida");
                        }
                    } else if (JOptionPane.showConfirmDialog(null,
                            "Você deseja continuar com essa senha?" + "\n<" + senha2 + ">") == noOption) {
                        String senha3 = JOptionPane.showInputDialog(null,
                                "Crie uma senha novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        if (JOptionPane.showConfirmDialog(null,
                                "Voce deseja continuar com essa senha?" + "\n<" + senha3 + ">") == okOption) {
                            //execução de uma nova senha
                            System.out.println(senha3);
                            int idade3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                            if (idade3 <= 10) {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                                System.out.println("Categoria Criança");
                                // imprime a categoria por idade
                                String user22 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp22 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user22 + ">");
                                if (pp22 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                    + "\nSeu email:" + email + "\nSua senha:" + senha3 +
                                                    "\nSeu nome:" + user22 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else if (pp22 == noOption) {
                                    String user23 = JOptionPane.showInputDialog(null,
                                            "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    int pp23 = JOptionPane.showConfirmDialog(null,
                                            "Confirme se seu nome esta correto" + "\n<" + user23 + ">");
                                    if (pp23 == okOption) {
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email: " + email +
                                                        "\nSua senha: " + senha3 + "\nSeu nome: " + user23 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Voce excedeu o numero limite de tentativas " +
                                                "\n Tente novamente");
                                        System.out.println("Cadastro cacelado");
                                    }
                                }
                            } else if (idade3 <= 17) {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adolescente");
                                System.out.println("Categoria Adoslecente");
                                // imprime a categoria por idade
                                String user24 = JOptionPane.showInputDialog(null,
                                        "Digie seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp24 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user24 + ">");
                                if (pp24 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email: " + email +
                                                    "\nSua senha: " + senha3 + "\nSeu nome: " + user24 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else if (pp24 == noOption) {
                                    String user25 = JOptionPane.showInputDialog(null,
                                            "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    int pp25 = JOptionPane.showConfirmDialog(null,
                                            "Confirme se seu nome esta correto" + "\n<" + user25 + ">");
                                    if (pp25 == okOption) {
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email: " + email +
                                                        "\nSua senha: " + senha3 + "\nSeu nome: " + user25 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Voce excedeu o numero limite de tentativas " +
                                                "\n Tente novamente");
                                        System.out.println("Cadastro cacelado");
                                    }
                                }
                            } else if (idade3 <= 60) {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                                System.out.println("Categoria Adulto");
                                // imprime a categoria por idade
                                String user26 = JOptionPane.showInputDialog(null, "Digie seu nome",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp26 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user26 + ">");
                                if (pp26 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email: " + email +
                                                    "\nSua senha: " + senha3 + "\nSeu nome: " + user26 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else if (pp26 == noOption) {
                                    String user27 = JOptionPane.showInputDialog(null,
                                            "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    int pp27 = JOptionPane.showConfirmDialog(null,
                                            "Confirme se seu nome esta correto" + "\n<" + user27 + ">");
                                    if (pp27 == okOption) {
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança"
                                                        + "\nSeu email: " + email + "\nSua senha: " + senha3 +
                                                        "\nSeu nome: " + user27 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Voce excedeu o numero limite de tentativas " +
                                                "\n Tente novamente");
                                        System.out.println("Cadastro cacelado");
                                    }
                                }
                            } else if (idade3 <= 200) {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                                System.out.println("Categoria Idoso");
                                // imprime a categoria por idade
                                String user28 = JOptionPane.showInputDialog(null, "Digie seu nome",
                                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                int pp28 = JOptionPane.showConfirmDialog(null,
                                        "Confirme se seu nome esta correto" + "\n<" + user28 + ">");
                                if (pp28 == okOption) {
                                    JOptionPane.showMessageDialog(null, "Categoria: Criança" +
                                                    "\nSeu email: " + email + "\nSua senha: " + senha3 +
                                                    "\nSeu nome: " + user28 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                } else if (pp28 == noOption) {
                                    String user29 = JOptionPane.showInputDialog(null,
                                            "Digie seu nome novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    int pp29 = JOptionPane.showConfirmDialog(null,
                                            "Confirme se seu nome esta correto" + "\n<" + user29 + ">");
                                    if (pp29 == okOption) {
                                        JOptionPane.showMessageDialog(null,
                                                "Categoria: Criança" + "\nSeu email: " + email + "\nSua senha: " + senha3 +
                                                        "\nSeu nome: " + user29 + "\nAgradecemos Sua colaboração!!! 😁👍😉",
                                                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Voce excedeu o numero limite de tentativas " +
                                                        "\n Tente novamente");
                                        System.out.println("Cadastro cacelado");
                                    }
                                }
                            } else {
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Idade invalida");
                            }
                        } else if (JOptionPane.showConfirmDialog(null,
                                "Voce deseja continuar com essa senha?" + "\n<" + senha3 + ">") == noOption) {
                            //variação com limite
                            JOptionPane.showMessageDialog(null,
                                    "Você Excedeu o numero de tentativas \nTente novamente mais tarde");
                            System.out.println("Cadastro cancelado");
                            //cancelamento do cadastro
                        } else {
                            JOptionPane.showMessageDialog(null, "Voce exedeu o numero de tentativas",
                                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }else if (conf == noOption){
            System.out.println("Cadastro cancelado");
            JOptionPane.showMessageDialog(null, "Voce nao digitou corretamente a palavra <Cadastro>",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
