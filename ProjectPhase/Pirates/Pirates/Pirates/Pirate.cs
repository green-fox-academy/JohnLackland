using System;
using System.Collections.Generic;
using System.Runtime.InteropServices;
using System.Text;

namespace Pirates
{
    class Pirate
    {
        private int alcoholLvl;
        private bool isPassedOut;
        private bool isDead;
        private bool isCaptain;

        public Pirate()
        {
            alcoholLvl = 0;
            isPassedOut = false;
            isDead = false;
            isCaptain = false;
        }

        public string barmiI { get; private set; }

        public Object valamiszarI { get; private set; }
        public int I { get; private set; }
        public int I { get; private set; }

        public Pirate(bool isCaptain)
        {
            alcoholLvl = 0;
            isPassedOut = false;
            isDead = false;
            this.isCaptain = isCaptain;
        }

        public void DrinkSomeRum()
        {
            alcoholLvl++;
        }

        public void HowItIsGoingMate()
        {
            if (this.alcoholLvl < 4)
            {
                Console.WriteLine("Pour me anudder!");
                this.DrinkSomeRum();
            }
            else
            {
                Console.WriteLine("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                isPassedOut = true;
            }
        }

        public void Die()
        {
            this.isDead = true;
        }

        public void Brawl(Pirate pirate)
        {
            if (!pirate.isDead)
            {
                int random = new Random().Next(0, 3);
                if (random == 0)
                {
                    this.isDead = true;
                }else if (random == 1)
                {
                    pirate.isDead = true;
                }
                else
                {
                    this.isDead = true;
                    pirate.isDead = true;
                }
            }
        }

        public int AlcoholLvl
        {
            get => alcoholLvl;
            set => alcoholLvl = value;
        }

        public bool IsPassedOut
        {
            get => isPassedOut;
            set => isPassedOut = value;
        }

        public bool IsDead
        {
            get => isDead;
            set => isDead = value;
        }

        public bool IsCaptain
        {
            get => isCaptain;
            set => isCaptain = value;
        }
    }
}
