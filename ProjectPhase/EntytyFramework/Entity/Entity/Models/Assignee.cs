using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace Entity.Models
{
    public class Assignee
    {
        public long Id { get; set; }
        public string name { get; set; }
        //[ForeignKey("Idegenkulcs")]

        public virtual List<Todo> Todos { get; set; }
    }
}
