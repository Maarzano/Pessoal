﻿int[] ints = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

Console.WriteLine(string.Join(", ", ints.Where(numero => numero % 2 == 0)));