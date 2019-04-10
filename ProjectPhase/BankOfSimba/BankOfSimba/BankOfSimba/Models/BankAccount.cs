using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BankOfSimba.Models
{
    public class BankAccount
    {
        public long Id { get; set; }
        private static long GlobalId = 0;
        public string Name { get; set; }
        public int Balance { get; set; }
        public string AnimalType { get; set; }
        public bool IsKing { get; set; }

        public BankAccount()
        {
            GlobalId++;
            Id = GlobalId;
        }
        

        public BankAccount(string name, int balance, string animalType, bool isKing)
        {
            GlobalId++;
            Name = name;
            Balance = balance;
            AnimalType = animalType;
            Id = GlobalId;
            IsKing = isKing;

        }
    }
}
