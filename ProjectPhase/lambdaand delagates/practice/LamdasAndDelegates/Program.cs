using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text.RegularExpressions;

namespace LamdasAndDelegates
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            var evenNumbers = n.Where(s => s % 2 == 0);
            Console.WriteLine(string.Join(",", evenNumbers));
            var avarage = n.Average();
            Console.WriteLine(string.Join(",", avarage));
            var moreThen20 = n.Where(s => s * s > 20).Select(p => p * p);
            Console.WriteLine(string.Join(",", moreThen20));

            string[] cities = { "ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS" };

            var citiesWithAAndI = cities.Where(s => s[0].Equals('A') && s[s.Length - 1].Equals('I'));
            Console.WriteLine(string.Join(",", citiesWithAAndI));

            string findUppercase = "Na mOsT minden lYO Ugy";
            Console.WriteLine(string.Join(",",  string.Concat(findUppercase.Where(c => c >= 'A' && c <= 'Z'))));

            mostCommonWords();


            Console.Read();
        }

        public static string FileReader(String filePath)
        {
            try
            {
                return File.ReadAllText(filePath);
            }
            catch (Exception e)
            {

                return $"{filePath} is not exists";
            }
        }

        public static void mostCommonWords()
        {
            string text = FileReader("wiki1.txt");
            //Console.WriteLine(string.Join("" , Regex.Replace(text, @"\s+", " ")));
            // Write a LINQ Expression to convert a char array to a string.
            char[] charArray = { 'a', 'p', 'p', 'l', 'e' };

           

            string a = charArray.Select(d => d).ToString();

            string b = String.Join("", charArray.Select(p =>  p.ToString()).ToArray());
            string o = new string(charArray);
           

            Console.WriteLine(b + " " + o + " " + a);


            string stringToCheck = "I'm gonna tell you something you don't want to hear, I'm gonna show you where it's dark, but have no fear";
            Dictionary<char, int> charFrequency = stringToCheck.ToCharArray().Where(c => !c.Equals(' ')).GroupBy(n => char.ToLower(n)).ToDictionary(g => g.Key, g => g.Count());

            foreach (KeyValuePair<char, int> kvp in charFrequency)
            {
                Console.WriteLine("Key = {0}, Value = {1}", kvp.Key, kvp.Value);
            }

            string test = string.Join("", Regex.Replace(text, @"\s+", " "));

            Dictionary<string, int> wordFrequency =
                test.Split(" ").GroupBy(n => n.ToUpper()).Take(100).ToDictionary(g => g.Key, g => g.Count());
     
            foreach (KeyValuePair<string, int> words in wordFrequency.OrderByDescending(g => g.Value))
            {
                Console.WriteLine($"{words.Key}: {words.Value}");
            }
        }


    }
    }

