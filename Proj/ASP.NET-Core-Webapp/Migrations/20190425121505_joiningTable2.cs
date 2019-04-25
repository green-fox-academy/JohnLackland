using Microsoft.EntityFrameworkCore.Migrations;

namespace ASP.NET_Core_Webapp.Migrations
{
    public partial class joiningTable2 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.RenameColumn(
                name: "Namee",
                table: "Users",
                newName: "Name");

            migrationBuilder.AddColumn<long>(
                name: "BadgeLevelId",
                table: "Users",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Users_BadgeLevelId",
                table: "Users",
                column: "BadgeLevelId");

            migrationBuilder.AddForeignKey(
                name: "FK_Users_BadgeLevels_BadgeLevelId",
                table: "Users",
                column: "BadgeLevelId",
                principalTable: "BadgeLevels",
                principalColumn: "BadgeLevelId",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Users_BadgeLevels_BadgeLevelId",
                table: "Users");

            migrationBuilder.DropIndex(
                name: "IX_Users_BadgeLevelId",
                table: "Users");

            migrationBuilder.DropColumn(
                name: "BadgeLevelId",
                table: "Users");

            migrationBuilder.RenameColumn(
                name: "Name",
                table: "Users",
                newName: "Namee");
        }
    }
}
