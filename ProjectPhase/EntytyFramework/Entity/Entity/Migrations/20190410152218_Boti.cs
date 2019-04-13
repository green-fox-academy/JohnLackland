using Microsoft.EntityFrameworkCore.Migrations;

namespace Entity.Migrations
{
    public partial class Boti : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<string>(
                name: "Description",
                table: "Todos",
                nullable: true);

            migrationBuilder.AddColumn<string>(
                name: "test3",
                table: "Todos",
                nullable: true);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropColumn(
                name: "Description",
                table: "Todos");

            migrationBuilder.DropColumn(
                name: "test3",
                table: "Todos");
        }
    }
}
