using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Att60.Models {
    public static class ClassesExtension {
        public static int CaracteresUnicos(this string str){
            return str.ToHashSet<char>().Count;
        }
        
    }
}