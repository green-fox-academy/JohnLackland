﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ASP.NET_Core_Webapp.Entities
{
    public class Badge
    {
        public long BadgeId { get; set; }
        public  string Version { get; set; }
        public string Name { get; set; }
        public string Tag { get; set; }
        public ICollection<BadgeLevel> Levels { get; set; }

        
    }
}
