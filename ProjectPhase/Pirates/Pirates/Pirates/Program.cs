using System;

namespace Pirates
{
    class Program
    {
        static void Main(string[] args)
        {
            PirateShip ship1 = new PirateShip();
            PirateShip ship2 = new PirateShip();
            ship2.FillShip();
            ship1.FillShip();
            
            ship1.battle(ship2);
            Console.Read();

        }
    }
}
