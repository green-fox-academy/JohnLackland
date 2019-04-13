using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;

namespace Entity.Migrations
{
    public partial class Test10 : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.AddColumn<long>(
                name: "assigneeId",
                table: "Todos",
                nullable: true);

            migrationBuilder.CreateTable(
                name: "Assignee",
                columns: table => new
                {
                    Id = table.Column<long>(nullable: false)
                        .Annotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn),
                    name = table.Column<string>(nullable: true)
                },
                constraints: table =>
                {
                    table.PrimaryKey("PK_Assignee", x => x.Id);
                });

            migrationBuilder.CreateIndex(
                name: "IX_Todos_assigneeId",
                table: "Todos",
                column: "assigneeId");

            migrationBuilder.AddForeignKey(
                name: "FK_Todos_Assignee_assigneeId",
                table: "Todos",
                column: "assigneeId",
                principalTable: "Assignee",
                principalColumn: "Id",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Todos_Assignee_assigneeId",
                table: "Todos");

            migrationBuilder.DropTable(
                name: "Assignee");

            migrationBuilder.DropIndex(
                name: "IX_Todos_assigneeId",
                table: "Todos");

            migrationBuilder.DropColumn(
                name: "assigneeId",
                table: "Todos");
        }
    }
}
