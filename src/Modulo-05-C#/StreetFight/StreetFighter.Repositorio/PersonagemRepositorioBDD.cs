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
    public class PersonagemRepositorioBDD : IPersonagemRepositorio
    {
        private string connectionString = ConfigurationManager.ConnectionStrings["StreetFighterConection"].ConnectionString;

        public void EditarPersonagem(Personagem personagem)
        {
            var sql = "UPDATE personagem" +
                        "SET Nome = @param_nome," +
                        "Nascimento = @param_nascimento," +
                        "Altura = @param_altura," +
                        "Origem = @param_origem," +
                        "Peso = @param_peso," +
                        "Imagem = @param_imagem," +
                        "GolpeEspecialFamoso = @param_golpeEspecialFamoso," +
                        "PersonagemOculto = @param_personagemOculto" +
                        "WHERE Id = @param_id;";
            this.ExecuteNonQuery(sql, personagem);
        }
        public List<Personagem> ListarPersonagem(string filtroNome = "%")
        {
            var lista = new List<Personagem>();
            using (var connection = new SqlConnection(connectionString))
            {
                connection.Open();
                string sql = $"SELECT * FROM FichaTecnica WHERE Nome like @filter_nome";
                var comando = new SqlCommand(sql, connection);
                comando.Parameters.Add(new SqlParameter("filter_nome", $"%{filtroNome}%"));
                SqlDataReader leitor = comando.ExecuteReader();
                while (leitor.Read())
                {
                    lista.Add(this.ToPersonagem(leitor));
                }
                connection.Close();
            }
            return lista;
        }
        private Personagem ToPersonagem(SqlDataReader leitor)
        {
            return new Personagem(Convert.ToInt32(leitor["Id"]),
                                   leitor["Nome"].ToString(),
                                   Convert.ToDateTime(leitor["Nascimento"]),
                                   Convert.ToInt32(leitor["Altura"]),
                                   leitor["Origem"].ToString(),
                                   Convert.ToDecimal(leitor["Peso"]),
                                   leitor["Imagem"].ToString(),
                                   leitor["GolpeEspecialFamoso"].ToString(),
                                   Convert.ToBoolean(leitor["PersonagemOculto"])); 
        }

        private void ExecuteNonQuery(string sql, Personagem personagem)
        {
            using (var connection = new SqlConnection(connectionString))
            {
                connection.Open();
                var comando = new SqlCommand(sql, connection);
                comando.Parameters.Add(new SqlParameter("param_nome", personagem.Nome));
                comando.Parameters.Add(new SqlParameter("param_nascimento", personagem.Nascimento));
                comando.Parameters.Add(new SqlParameter("param_altura", personagem.Altura));
                comando.Parameters.Add(new SqlParameter("param_origem", personagem.Origem));
                comando.Parameters.Add(new SqlParameter("param_peso", personagem.Peso));
                comando.Parameters.Add(new SqlParameter("param_imagem", personagem.Imagem));
                comando.Parameters.Add(new SqlParameter("param_golpeEspecialFamoso", personagem.GolpeEspecialFamoso));
                comando.Parameters.Add(new SqlParameter("param_personagemOculto", personagem.PersonagemOculto));
                comando.Parameters.Add(new SqlParameter("param_id", personagem.Id));
                comando.ExecuteNonQuery();
                connection.Close();

            }
        }

        public void IncluirPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }

        public void ExcluirPersonagem(Personagem personagem)
        {
            throw new NotImplementedException();
        }
    }
}
