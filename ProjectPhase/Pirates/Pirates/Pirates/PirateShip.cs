using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;

namespace Pirates
{
    class PirateShip
    {
        List<Pirate> piratesOfTheShip = new List<Pirate>();

        public void FillShip()
        {
            for (int i = 0; i < new Random().Next(1, 200); i++)
            {
                if (piratesOfTheShip.Count == 0)
                {    
                    piratesOfTheShip.Add(new Pirate(true));
                }
                piratesOfTheShip.Add(new Pirate());
            }
        }

        public void status()
        {

            if (piratesOfTheShip.Count == 0)
            {
                Console.WriteLine("The pirate ship is empty");
            }
            else
            {
            Pirate captain = piratesOfTheShip[0];
            Console.WriteLine($"The Captain consumed {captain.AlcoholLvl} round(s) of rum." +
                              $"\nHe is " + (captain.IsDead?"dead":"alive " + 
                              (captain.IsPassedOut?"but passed out!":"and awake!")) +
                               $"\nThere is alive pirates {CountAlivePirates()}");
            }
        }

        public void battle(PirateShip ship)
        {
            int counter = 0;
            while (this.CountAlivePirates() != 0 && ship.CountAlivePirates() != 0)
            {
                this.status();
                ship.status();
                if (this.scoreCounter() > ship.scoreCounter())
                {
                    Console.WriteLine($"The attacker ship has won the {counter}. battle and the defender ship has got " +
                                      $"{ship.piratesOfTheShip} alive pirates left.");
                    ship.killPirates();
                }
                else
                {
                    Console.WriteLine($"The attacker ship has won the {counter}. battle and the defender ship has got " +
                                      $"{ship.piratesOfTheShip} alive pirates left.");
                    this.killPirates();
                }

                counter++;
            }
        }

        private int CountAlivePirates()
        {
            int counter = 0;
            foreach (var pirate in piratesOfTheShip)
            {
                if (!pirate.IsDead)
                {
                    counter++;
                }
            }
            return counter;
        }

        private int scoreCounter()
        {
            return (this.CountAlivePirates() - this.piratesOfTheShip[0].AlcoholLvl);
        }

        private void killPirates()
        {
            int randomDeath = new Random().Next(0, this.CountAlivePirates());

            
            for (int i = 0; i <= this.piratesOfTheShip.Count; i++)
            {
                if (randomDeath == 0)
                {

                    return;
                }

                if (!this.piratesOfTheShip[i].IsDead)
                {
                    randomDeath--;
                    this.piratesOfTheShip[i].IsDead = true;
                }
            }
        }
    }

}
