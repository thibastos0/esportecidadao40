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

}
