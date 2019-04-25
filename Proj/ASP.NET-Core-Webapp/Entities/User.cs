﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ASP.NET_Core_Webapp.Entities
{
    public class User
    {
        public long UserId { get; set; }
        public string Name { get; set; }
        public string Picture { get; set; }
        public string Email { get; set; }
        public string OpenId { get; set; }
        public virtual ICollection<UserLevel> UserLevels { get; set; }

        public User()
        {
            UserLevels = new List<UserLevel>();
        }
    }
}
