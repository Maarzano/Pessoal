using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AttRevisão4.Models {
    public class Classe {
        
        public static async Task ParalelTask(){
            Task task = Task1();
            Task task2 = Task2();

            await Task.WhenAll(task, task2);
            Console.WriteLine("As duas foram completas");
        }
        private static async Task Task1(){
            await Task.Delay(2000);
            Console.WriteLine("Task 1 completed");
        }
        private static async Task Task2(){
            await Task.Delay(3000);
            Console.WriteLine("Task 2 completed");
        }
        
    }
}