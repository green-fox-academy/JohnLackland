using Microsoft.EntityFrameworkCore.Migrations;

namespace ASP.NET_Core_Webapp.Migrations
{
    public partial class joiningTable : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Pitches_StudentInfo2_UserId",
                table: "Pitches");

            migrationBuilder.DropForeignKey(
                name: "FK_Reviews_StudentInfo2_UserId",
                table: "Reviews");

            migrationBuilder.DropForeignKey(
                name: "FK_StudentInfo2_BadgeLevels_BadgeLevelId",
                table: "StudentInfo2");

            migrationBuilder.DropPrimaryKey(
                name: "PK_StudentInfo2",
                table: "StudentInfo2");

            migrationBuilder.DropIndex(
                name: "IX_StudentInfo2_BadgeLevelId",
                table: "StudentInfo2");

            migrationBuilder.DropColumn(
                name: "BadgeLevelId",
                table: "StudentInfo2");

            migrationBuilder.RenameTable(
                name: "StudentInfo2",
                newName: "Users");

            migrationBuilder.AddColumn<long>(
                name: "UserId",
                table: "BadgeLevels",
                nullable: true);

            migrationBuilder.AddPrimaryKey(
                name: "PK_Users",
                table: "Users",
                column: "UserId");

            migrationBuilder.CreateIndex(
                name: "IX_BadgeLevels_UserId",
                table: "BadgeLevels",
                column: "UserId");

            migrationBuilder.AddForeignKey(
                name: "FK_BadgeLevels_Users_UserId",
                table: "BadgeLevels",
                column: "UserId",
                principalTable: "Users",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Pitches_Users_UserId",
                table: "Pitches",
                column: "UserId",
                principalTable: "Users",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Reviews_Users_UserId",
                table: "Reviews",
                column: "UserId",
                principalTable: "Users",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_BadgeLevels_Users_UserId",
                table: "BadgeLevels");

            migrationBuilder.DropForeignKey(
                name: "FK_Pitches_Users_UserId",
                table: "Pitches");

            migrationBuilder.DropForeignKey(
                name: "FK_Reviews_Users_UserId",
                table: "Reviews");

            migrationBuilder.DropIndex(
                name: "IX_BadgeLevels_UserId",
                table: "BadgeLevels");

            migrationBuilder.DropPrimaryKey(
                name: "PK_Users",
                table: "Users");

            migrationBuilder.DropColumn(
                name: "UserId",
                table: "BadgeLevels");

            migrationBuilder.RenameTable(
                name: "Users",
                newName: "StudentInfo2");

            migrationBuilder.AddColumn<long>(
                name: "BadgeLevelId",
                table: "StudentInfo2",
                nullable: true);

            migrationBuilder.AddPrimaryKey(
                name: "PK_StudentInfo2",
                table: "StudentInfo2",
                column: "UserId");

            migrationBuilder.CreateIndex(
                name: "IX_StudentInfo2_BadgeLevelId",
                table: "StudentInfo2",
                column: "BadgeLevelId");

            migrationBuilder.AddForeignKey(
                name: "FK_Pitches_StudentInfo2_UserId",
                table: "Pitches",
                column: "UserId",
                principalTable: "StudentInfo2",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_Reviews_StudentInfo2_UserId",
                table: "Reviews",
                column: "UserId",
                principalTable: "StudentInfo2",
                principalColumn: "UserId",
                onDelete: ReferentialAction.Restrict);

            migrationBuilder.AddForeignKey(
                name: "FK_StudentInfo2_BadgeLevels_BadgeLevelId",
                table: "StudentInfo2",
                column: "BadgeLevelId",
                principalTable: "BadgeLevels",
                principalColumn: "BadgeLevelId",
                onDelete: ReferentialAction.Restrict);
        }
    }
}
