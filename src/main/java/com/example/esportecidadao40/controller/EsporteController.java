package com.example.esportecidadao40.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import jakarta.servlet.http.HttpSession;

@Controller
public class EsporteController {

    @GetMapping("/")
    public String home() {
        return "Esporte4/1_Telas_Publicas/index";
    }

    @GetMapping("/explorar")
    public String explorar() {
        return "Esporte4/1_Telas_Publicas/explorar";
    }

    @GetMapping("/login")
    public String login() {
        return "Esporte4/1_Telas_Publicas/login";
    }

    // Simulated login endpoint: sets a session attribute and redirects to aluno dashboard
    @GetMapping("/do-login")
    public String doLogin(HttpSession session) {
        session.setAttribute("usuario", "aluno-simulado");
        return "redirect:/aluno/dashboard";
    }

    // Simulated login for professor: sets professorUsuario and redirects to professor dashboard
    @GetMapping("/do-login-professor")
    public String doLoginProfessor(HttpSession session) {
        session.setAttribute("professorUsuario", "prof-simulado");
        return "redirect:/professor/dashboard";
    }

    // Simulated login for gestor: sets gestorUsuario and redirects to gestor dashboard
    @GetMapping("/do-login-gestor")
    public String doLoginGestor(HttpSession session) {
        session.setAttribute("gestorUsuario", "gestor-simulado");
        return "redirect:/gestor/dashboard";
    }

    // Simulated login for gestor ADM: sets gestorAdmUsuario and redirects to gestor-adm dashboard
    @GetMapping("/do-login-gestor-adm")
    public String doLoginGestorAdm(HttpSession session) {
        session.setAttribute("gestorAdmUsuario", "admin-simulado");
        return "redirect:/gestor-adm/dashboard";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    // Area do aluno (simple session check to simulate auth)
    @GetMapping("/aluno/dashboard")
    public String alunoDashboard(HttpSession session) {
        if (session.getAttribute("usuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/2_Telas_Aluno/dashboard";
    }

    @GetMapping("/aluno/inscricao")
    public String alunoInscricao(HttpSession session) {
        if (session.getAttribute("usuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/2_Telas_Aluno/inscricao";
    }

    @GetMapping("/aluno/turma")
    public String alunoTurma(HttpSession session) {
        if (session.getAttribute("usuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/2_Telas_Aluno/turma";
    }

    @GetMapping("/aluno/comunicados")
    public String alunoComunicados(HttpSession session) {
        if (session.getAttribute("usuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/2_Telas_Aluno/comunicados";
    }

    @GetMapping("/aluno/perfil")
    public String alunoPerfil(HttpSession session) {
        if (session.getAttribute("usuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/2_Telas_Aluno/perfil";
    }

    // Area do professor (session check with professorUsuario)
    @GetMapping("/professor/dashboard")
    public String professorDashboard(HttpSession session) {
        if (session.getAttribute("professorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/3_Telas_Professor/dashboard";
    }

    @GetMapping("/professor/turmas")
    public String professorTurmas(HttpSession session) {
        if (session.getAttribute("professorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/3_Telas_Professor/turmas";
    }

    @GetMapping("/professor/frequencia")
    public String professorFrequencia(HttpSession session) {
        if (session.getAttribute("professorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/3_Telas_Professor/presenca";
    }

    @GetMapping("/professor/materiais")
    public String professorMateriais(HttpSession session) {
        if (session.getAttribute("professorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/3_Telas_Professor/materiais";
    }

    @GetMapping("/professor/comunicados")
    public String professorComunicados(HttpSession session) {
        if (session.getAttribute("professorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/3_Telas_Professor/comunicados";
    }

    @GetMapping("/professor/perfil")
    public String professorPerfil(HttpSession session) {
        if (session.getAttribute("professorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/3_Telas_Professor/perfil";
    }

    // Area do gestor (session check with gestorUsuario)
    @GetMapping("/gestor/dashboard")
    public String gestorDashboard(HttpSession session) {
        if (session.getAttribute("gestorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/4_Gestor_Local/dashboard";
    }

    @GetMapping("/gestor/nucleos")
    public String gestorNucleos(HttpSession session) {
        if (session.getAttribute("gestorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/4_Gestor_Local/nucleos";
    }

    @GetMapping("/gestor/professores")
    public String gestorProfessores(HttpSession session) {
        if (session.getAttribute("gestorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/4_Gestor_Local/professores";
    }

    @GetMapping("/gestor/relatorios")
    public String gestorRelatorios(HttpSession session) {
        if (session.getAttribute("gestorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/4_Gestor_Local/relatorios";
    }

    @GetMapping("/gestor/configuracoes")
    public String gestorConfiguracoes(HttpSession session) {
        if (session.getAttribute("gestorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/4_Gestor_Local/configuracoes";
    }

    @GetMapping("/gestor/perfil")
    public String gestorPerfil(HttpSession session) {
        if (session.getAttribute("gestorUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/4_Gestor_Local/perfil";
    }

    // Area do gestor ADM (session check with gestorAdmUsuario)
    @GetMapping("/gestor-adm/dashboard")
    public String gestorAdmDashboard(HttpSession session) {
        if (session.getAttribute("gestorAdmUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/5_Gestor_ADM/dashboard";
    }

    @GetMapping("/gestor-adm/usuarios")
    public String gestorAdmUsuarios(HttpSession session) {
        if (session.getAttribute("gestorAdmUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/5_Gestor_ADM/usuarios";
    }

    @GetMapping("/gestor-adm/nucleos")
    public String gestorAdmNucleos(HttpSession session) {
        if (session.getAttribute("gestorAdmUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/5_Gestor_ADM/nucleos";
    }

    @GetMapping("/gestor-adm/relatorios")
    public String gestorAdmRelatorios(HttpSession session) {
        if (session.getAttribute("gestorAdmUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/5_Gestor_ADM/relatorios";
    }

    @GetMapping("/gestor-adm/auditoria")
    public String gestorAdmAuditoria(HttpSession session) {
        if (session.getAttribute("gestorAdmUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/5_Gestor_ADM/auditoria";
    }

    @GetMapping("/gestor-adm/perfil")
    public String gestorAdmPerfil(HttpSession session) {
        if (session.getAttribute("gestorAdmUsuario") == null) {
            return "redirect:/login";
        }
        return "Esporte4/5_Gestor_ADM/perfil";
    }

}
