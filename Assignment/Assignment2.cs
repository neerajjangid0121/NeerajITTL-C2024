using System;
using System.Numerics;
class Subarray
{
    private long[] calculateSumOfPrefix(int[] arrayElements, int[] countOfElementsAndQueries)
    {
        long[] prefixSum = new long[countOfElementsAndQueries[0] + 1];
        prefixSum[0] = 0;
        for (int index = 1; index <= countOfElementsAndQueries[0]; index++)
        {
            prefixSum[index] = prefixSum[index - 1] + arrayElements[index - 1];
        }
        return prefixSum;
    }
    
    static void Main(string[] args)
    {
        var countOfElementsAndQueries = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        var arrayElements = Array.ConvertAll(Console.ReadLine().Split(' '), long.Parse);

        long[] prefixSum = calculateSumOfPrefix(arrayElements, countOfElementsAndQueries);

        for (var x = 0; x < countOfElementsAndQueries[1]; x++)
        {
            var range = Array.ConvertAll(Console.ReadLine().Split(' '), int.
            Console.WriteLine((long)((long)(prefixSum[range[1]] - prefixSum[range[0] - 1]) / (range[1] - range[0] + 1)));
        }
    }
}