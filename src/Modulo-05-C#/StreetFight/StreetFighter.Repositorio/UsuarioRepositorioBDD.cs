using StreetFighter.Dominio;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StreetFighter.Repositorio
{
    public class UsuarioRepositorioBDD
    {
        public static string connectionString = ConfigurationManager.ConnectionStrings["StreetFighterConection"].ConnectionString;
        public static List<Login> ListaUsuario()
        {
            var lista = new List<Login>();
            using (var connection = new SqlConnection(connectionString))
            {
                connection.Open();
                string sql = $"SELECT * FROM Usuario;";
                var comando = new SqlCommand(sql, connection);
                SqlDataReader leitor = comando.ExecuteReader();
                while (leitor.Read())
                {
                    lista.Add(new Login()
                    {
                        Nome = leitor["Usuario"].ToString(),
                        Senha = leitor["Senha"].ToString(),
                        Permissao = leitor["Permissao"].ToString().Split(';')
                    });                        
                }
                connection.Close();
            }
            return lista;
        }

    }
}
