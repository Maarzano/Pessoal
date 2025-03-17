using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão7.Models {
    public class Classe {
        public static double? ToDouble(object valor) {
            try {

                if (valor == null) return null;

                return Convert.ToDouble(valor);

            } catch (InvalidCastException) {

                Console.WriteLine("Erro: Tipo de dado não suportado para conversão.");

            } catch (FormatException) {
                Console.WriteLine("Erro: Formato inválido para conversão.");
            } catch (OverflowException) {
                Console.WriteLine("Erro: Valor fora do intervalo permitido para um double.");
            } catch (Exception ex) {
                Console.WriteLine($"Erro inesperado: {ex.Message}");
            }
            return null;
        }
    }
}