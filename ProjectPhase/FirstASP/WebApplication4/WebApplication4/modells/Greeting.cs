using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace WebApplication4.modells
{
    public class Greeting
    {
        
        public long Id { get; set; }
        public string Content { get; set; }
        private static long GlobalId { get; set; }
        

        public Greeting()
        {
            
        }

        public Greeting(long id, string content)
        {
            this.Id = id;
            this.Content = content;
        }

       

    }
}
