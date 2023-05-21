import javax.swing.JOptionPane;
//importar a biblioteca JOptionPane
public class Main {
    //classe publica
    public static void main(String[] args) {
        //linha de execução
        int noOption = JOptionPane.NO_OPTION;
        int okOption = JOptionPane.OK_OPTION;
        String pol = JOptionPane.showInputDialog(null, "Digite <Cadastro> \npara verificarmos se nao e um robo", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        int conf = JOptionPane.showConfirmDialog(null, "Verifique se digitou <Cadastro> corretamente" + "\nsua digitação " + "<" + pol + ">");
        //confirmar a palavra
        //cofirmação para nao ser um robo
        if (conf == okOption) {
            System.out.println(pol);
            // impreção no monitor serial
            String email = JOptionPane.showInputDialog(null, "Digite seu email", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            int email1 = JOptionPane.showConfirmDialog(null, "Verifique se o seu email esta correto" + "\n<" + email + ">");
            if (email1 == okOption) {
                //JOpitionPane para digitare verificar email
                System.out.println(email);
                //emprime o email no monitor serial
                String senha = JOptionPane.showInputDialog(null, "Crie uma senha para você", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                if (JOptionPane.showConfirmDialog(null, "Você deseja continuar com essa senha?" + "\n<" + senha + ">") == okOption) {
                    System.out.println(senha);
                    //JOpitioPane para criar uma senha
                    //sout, imprime no monitor serial
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                    if(idade <= 10){
                        //categoria por idade
                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                        System.out.println("Categoria Criança");
                        // imprime a categoria por idade
                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email + "\nSua senha:" + senha +
                                "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }else if (idade <= 17){
                        //categoria por idade
                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adolescente");
                        System.out.println("Categoria Adoslecente");
                        // imprime a categoria por idade
                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email + "\nSua senha:" + senha +
                                "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }else if (idade <= 60){
                        //categoria por idade
                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                        System.out.println("Categoria Adulto");
                        // imprime a categoria por idade
                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email + "\nSua senha:" + senha +
                                "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }else if (idade <= 200){
                        //categoria por idade
                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                        System.out.println("Categoria Idoso");
                        // imprime a categoria por idade
                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email + "\nSua senha:" + senha +
                                "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    }else if (idade > 200){
                        //categoria por idade
                        JOptionPane.showMessageDialog(null, "Idade invalida");
                    }
                } else if (JOptionPane.showConfirmDialog(null, "Você deseja continuar com essa senha?" + "\n<" + senha + ">") == noOption) {
                    String senha1 = JOptionPane.showInputDialog(null, "Crie uma senha novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    if (JOptionPane.showConfirmDialog(null, "Voce deseja continuar com essa senha?" + "\n<" + senha1 + ">") == okOption) {
                        //execução de uma nova senha
                        System.out.println(senha1);
                        int idade1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                        if(idade1 <= 10){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                            System.out.println("Categoria Criança");
                            // imprime a categoria por idade
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email + "\nSua senha:" + senha +
                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }else if (idade1 <= 17){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adolescente");
                            System.out.println("Categoria Adoslecente");
                            // imprime a categoria por idade
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email + "\nSua senha:" + senha +
                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }else if (idade1 <= 60){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                            System.out.println("Categoria Adulto");
                            // imprime a categoria por idade
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email + "\nSua senha:" + senha +
                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }else if (idade1 <= 200){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                            System.out.println("Categoria Idoso");
                            // imprime a categoria por idade
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email + "\nSua senha:" + senha +
                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }else if (idade1 > 200){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Idade invalida");
                        }
                    } else if (JOptionPane.showConfirmDialog(null, "Voce deseja continuar com essa senha?" + "\n<" + senha1 + ">") == noOption) {
                        //variação com limite
                        JOptionPane.showMessageDialog(null, "Você Excedeu o numero de tentativas \nTente novamente mais tarde");
                        System.out.println("Cadastro cancelado");
                        //cancelamento do cadastro
                    }
                }
            } else if (email1 == noOption) {
                String email0 = JOptionPane.showInputDialog(null, "Digite novamente seu email você tem mais 1 tentativas", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                int email2 = JOptionPane.showConfirmDialog(null, "Verifique se o seu email esta correto" + "\n<" + email + ">");
                //digitou email errado
                if (email2 == okOption) {
                    //JOpitionPane para digitare verificar email
                    System.out.println(email0);
                    //emprime o email no monitor serial
                    String senha2 = JOptionPane.showInputDialog(null, "Crie uma senha para você", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    if (JOptionPane.showConfirmDialog(null, "Você deseja continuar com essa senha?" + "\n<" + senha2 + ">") == okOption) {
                        System.out.println(senha2);
                        //JOpitioPane para criar uma senha
                        //sout, imprime no monitor serial
                        int idade2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                        if(idade2 <= 10){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                            System.out.println("Categoria Criança");
                            // imprime a categoria por idade
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email0 + "\nSua senha:" + senha2 +
                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }else if (idade2 <= 17){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adolescente");
                            System.out.println("Categoria Adoslecente");
                            // imprime a categoria por idade
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email0 + "\nSua senha:" + senha2 +
                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }else if (idade2 <= 60){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                            System.out.println("Categoria Adulto");
                            // imprime a categoria por idade
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email0 + "\nSua senha:" + senha2 +
                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }else if (idade2 <= 200){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                            System.out.println("Categoria Idoso");
                            // imprime a categoria por idade
                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email0 + "\nSua senha:" + senha2 +
                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        }else if (idade2 > 200){
                            //categoria por idade
                            JOptionPane.showMessageDialog(null, "Idade invalida");
                        }
                    } else if (JOptionPane.showConfirmDialog(null, "Você deseja continuar com essa senha?" + "\n<" + senha2 + ">") == noOption) {
                        String senha3 = JOptionPane.showInputDialog(null, "Crie uma senha novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        if (JOptionPane.showConfirmDialog(null, "Voce deseja continuar com essa senha?" + "\n<" + senha3 + ">") == okOption) {
                            //execução de uma nova senha
                            System.out.println(senha3);
                            int idade3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                            if(idade3 <= 10){
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                                System.out.println("Categoria Criança");
                                // imprime a categoria por idade
                                JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email0 + "\nSua senha:" + senha3 +
                                        "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            }else if (idade3 <= 17){
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adolescente");
                                System.out.println("Categoria Adoslecente");
                                // imprime a categoria por idade
                                JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email0 + "\nSua senha:" + senha3 +
                                        "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            }else if (idade3 <= 60){
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                                System.out.println("Categoria Adulto");
                                // imprime a categoria por idade
                                JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email0 + "\nSua senha:" + senha3 +
                                        "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            }else if (idade3 <= 200){
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                                System.out.println("Categoria Idoso");
                                // imprime a categoria por idade
                                JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email0 + "\nSua senha:" + senha3 +
                                        "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            }else if (idade3 > 200){
                                //categoria por idade
                                JOptionPane.showMessageDialog(null, "Idade invalida");
                            }
                        } else if (JOptionPane.showConfirmDialog(null, "Voce deseja continuar com essa senha?" + "\n<" + senha3 + ">") == noOption) {
                            //variação com limite
                            JOptionPane.showMessageDialog(null, "Você Excedeu o numero de tentativas \nTente novamente mais tarde");
                            System.out.println("Cadastro cancelado");
                            //cancelamento do cadastro
                        } else if (email2 == noOption) {
                            //email2 troca
                            String email9 = JOptionPane.showInputDialog(null, "Digite seu novamente email", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                            int email3 = JOptionPane.showConfirmDialog(null, "Verifique se o seu email esta correto" + "\n<" + email + ">");
                            if (email3 == okOption) {
                                //JOpitionPane para digitare verificar email
                                System.out.println(email9);
                                //emprime o email no monitor serial
                                String senha4 = JOptionPane.showInputDialog(null, "Crie uma senha para você", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                if (JOptionPane.showConfirmDialog(null, "Você deseja continuar com essa senha?" + "\n<" + senha4 + ">") == okOption) {
                                    System.out.println(senha4);
                                    //JOpitioPane para criar uma senha
                                    //sout, imprime no monitor serial
                                    int idade4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                                    if(idade4 <= 10){
                                        //categoria por idade
                                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                                        System.out.println("Categoria Criança");
                                        // imprime a categoria por idade
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email9 + "\nSua senha:" + senha4 +
                                                "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (idade4 <= 17){
                                        //categoria por idade
                                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adolescente");
                                        System.out.println("Categoria Adoslecente");
                                        // imprime a categoria por idade
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email9 + "\nSua senha:" + senha4 +
                                                "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (idade4 <= 60){
                                        //categoria por idade
                                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                                        System.out.println("Categoria Adulto");
                                        // imprime a categoria por idade
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email9 + "\nSua senha:" + senha4 +
                                                "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (idade4 <= 200){
                                        //categoria por idade
                                        JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                                        System.out.println("Categoria Idoso");
                                        // imprime a categoria por idade
                                        JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email9 + "\nSua senha:" + senha4 +
                                                "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    }else if (idade4 > 200){
                                        //categoria por idade
                                        JOptionPane.showMessageDialog(null, "Idade invalida");
                                    }
                                } else if (JOptionPane.showConfirmDialog(null, "Você deseja continuar com essa senha?" + "\n<" + senha4 + ">") == noOption) {
                                    String senha5 = JOptionPane.showInputDialog(null, "Crie uma senha novamente", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    if (JOptionPane.showConfirmDialog(null, "Voce deseja continuar com essa senha?" + "\n<" + senha5 + ">") == okOption) {
                                        //execução de uma nova senha
                                        System.out.println(senha5);
                                        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade", "Cadastro", JOptionPane.INFORMATION_MESSAGE));
                                        if(idade <= 10){
                                            //categoria por idade
                                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria criança");
                                            System.out.println("Categoria Criança");
                                            // imprime a categoria por idade
                                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email9 + "\nSua senha:" + senha5 +
                                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (idade <= 17){
                                            //categoria por idade
                                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adolescente");
                                            System.out.println("Categoria Adoslecente");
                                            // imprime a categoria por idade
                                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email9 + "\nSua senha:" + senha5 +
                                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (idade <= 60){
                                            //categoria por idade
                                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria adulto");
                                            System.out.println("Categoria Adulto");
                                            // imprime a categoria por idade
                                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email9 + "\nSua senha:" + senha5 +
                                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (idade <= 200){
                                            //categoria por idade
                                            JOptionPane.showMessageDialog(null, "Voce foi adicionado a categoria idoso");
                                            System.out.println("Categoria Idoso");
                                            // imprime a categoria por idade
                                            JOptionPane.showMessageDialog(null, "Categoria: Criança" + "\nSeu email:" + email9 + "\nSua senha:" + senha5 +
                                                    "\nAgradecemos Sua colaboração!!! 😁👍😉", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                        }else if (idade > 200){
                                            //categoria por idade
                                            JOptionPane.showMessageDialog(null, "Idade invalida");
                                        }
                                    } else if (JOptionPane.showConfirmDialog(null, "Voce deseja continuar com essa senha?" + "\n<" + senha5 + ">") == noOption) {
                                        //variação com limite
                                        JOptionPane.showMessageDialog(null, "Você Excedeu o numero de tentativas \nTente novamente mais tarde");
                                        System.out.println("Cadastro cancelado");
                                        //cancelamento do cadastro
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Você errou a palavra para verificação", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                                    System.out.println("Cadastro cancelado");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}