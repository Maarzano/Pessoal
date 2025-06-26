import { useState } from 'react';

export const CadastroDIO = () => {
    const [form, setForm] = useState({
        nome: '',
        email: '',
        senha: '',
    });

    const handleChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        alert('Cadastro realizado com sucesso!');
    };

    return (
        <div style={{
            minHeight: '100vh',
            background: '#181529',
            display: 'flex',
            flexDirection: 'column'
        }}>
            {/* Header */}
            <div style={{
                width: '100%',
                height: 48,
                background: '#11101a',
                display: 'flex',
                alignItems: 'center',
                justifyContent: 'space-between',
                padding: '0 40px',
                boxSizing: 'border-box'
            }}>
                {/* Logo */}
                <div style={{ display: 'flex', alignItems: 'center', height: '100%' }}>
                    <span style={{
                        fontWeight: 900,
                        fontSize: 28,
                        fontFamily: 'Arial, sans-serif',
                        color: '#fff',
                        letterSpacing: 2,
                        display: 'flex',
                        alignItems: 'center'
                    }}>
                        <span style={{
                            color: '#6a4cff',
                            marginRight: 2,
                            fontWeight: 900
                        }}>d</span>
                        <span style={{
                            color: '#00e3a5',
                            marginRight: 2,
                            fontWeight: 900
                        }}>i</span>
                        <span style={{
                            color: '#e4105d',
                            fontWeight: 900
                        }}>o</span>
                        <span style={{
                            color: '#e4105d',
                            fontWeight: 900,
                            fontSize: 18,
                            marginLeft: 2
                        }}>.</span>
                    </span>
                </div>
                {/* Menu */}
                <div style={{ display: 'flex', gap: 12 }}>
                    <a href="#" style={{
                        color: '#fff',
                        textDecoration: 'none',
                        fontWeight: 400,
                        fontSize: 16,
                        marginRight: 8
                    }}>Home</a>
                    <button style={{
                        background: '#232134',
                        color: '#fff',
                        border: 'none',
                        borderRadius: 12,
                        padding: '4px 18px',
                        fontWeight: 600,
                        fontSize: 15,
                        marginRight: 8,
                        cursor: 'pointer'
                    }}>Entrar</button>
                    <button style={{
                        background: '#232134',
                        color: '#fff',
                        border: 'none',
                        borderRadius: 12,
                        padding: '4px 18px',
                        fontWeight: 600,
                        fontSize: 15,
                        cursor: 'pointer'
                    }}>Cadastrar</button>
                </div>
            </div>
            {/* Main Content */}
            <div style={{
                flex: 1,
                display: 'flex',
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
                padding: '0 5vw'
            }}>
                {/* Left - Text */}
                <div style={{
                    flex: 1,
                    color: '#fff',
                    fontSize: 2,
                    display: 'flex',
                    alignItems: 'center',
                    justifyContent: 'flex-end',
                    minWidth: 350,
                    maxWidth: 540,
                    paddingRight: 40
                }}>
                    <div style={{
                        fontWeight: 700,
                        fontSize: 2.2 + 'rem',
                        lineHeight: 1.2,
                        letterSpacing: 0.5,
                        color: '#fff'
                    }}>
                        A plataforma para você<br />
                        aprender com experts,<br />
                        dominar as principais<br />
                        tecnologias e entrar<br />
                        mais rápido nas<br />
                        empresas mais<br />
                        desejadas.
                    </div>
                </div>
                {/* Right - Form */}
                <div style={{
                    flex: 1,
                    minWidth: 340,
                    maxWidth: 400,
                    display: 'flex',
                    alignItems: 'center',
                    justifyContent: 'flex-start'
                }}>
                    <form
                        onSubmit={handleSubmit}
                        style={{
                            width: '100%',
                            background: 'transparent',
                            padding: '40px 32px 32px 32px',
                            borderRadius: 8,
                            color: '#fff',
                            display: 'flex',
                            flexDirection: 'column',
                            gap: '1.2rem'
                        }}
                    >
                        <div style={{
                            fontWeight: 700,
                            fontSize: '2rem',
                            marginBottom: 0,
                            color: '#fff'
                        }}>Comece agora grátis</div>
                        <div style={{
                            color: '#b2b2c2',
                            fontSize: 16,
                            marginTop: -12,
                            marginBottom: 8
                        }}>
                            Crie sua conta e make the change._
                        </div>
                        {/* Nome */}
                        <div style={{ position: 'relative' }}>
                            <span style={{
                                position: 'absolute',
                                left: 0,
                                top: '50%',
                                transform: 'translateY(-50%)',
                                color: '#a259e6',
                                fontSize: 20,
                                pointerEvents: 'none'
                            }}>
                                <svg width="20" height="20" fill="currentColor" style={{ marginLeft: 2 }}>
                                    <path d="M10 10a4 4 0 1 0 0-8 4 4 0 0 0 0 8zm0 2c-3.31 0-6 1.34-6 3v1a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1v-1c0-1.66-2.69-3-6-3z"/>
                                </svg>
                            </span>
                            <input
                                type="text"
                                name="nome"
                                placeholder="Nome completo"
                                value={form.nome}
                                onChange={handleChange}
                                required
                                style={{
                                    width: '100%',
                                    padding: '10px 10px 10px 32px',
                                    border: 'none',
                                    borderBottom: '2px solid #3a2e5c',
                                    background: 'transparent',
                                    color: '#fff',
                                    fontSize: 16,
                                    outline: 'none'
                                }}
                            />
                        </div>
                        {/* Email */}
                        <div style={{ position: 'relative' }}>
                            <span style={{
                                position: 'absolute',
                                left: 0,
                                top: '50%',
                                transform: 'translateY(-50%)',
                                color: '#a259e6',
                                fontSize: 20,
                                pointerEvents: 'none'
                            }}>
                                <svg width="20" height="20" fill="currentColor" style={{ marginLeft: 2 }}>
                                    <path d="M2 4a2 2 0 0 1 2-2h12a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V4zm2 0v.01L10 9l6-4.99V4H4zm14 2.236l-6.764 5.637a1 1 0 0 1-1.472 0L2 6.236V16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V6.236z"/>
                                </svg>
                            </span>
                            <input
                                type="email"
                                name="email"
                                placeholder="E-mail"
                                value={form.email}
                                onChange={handleChange}
                                required
                                style={{
                                    width: '100%',
                                    padding: '10px 10px 10px 32px',
                                    border: 'none',
                                    borderBottom: '2px solid #3a2e5c',
                                    background: 'transparent',
                                    color: '#fff',
                                    fontSize: 16,
                                    outline: 'none'
                                }}
                            />
                        </div>
                        {/* Senha */}
                        <div style={{ position: 'relative' }}>
                            <span style={{
                                position: 'absolute',
                                left: 0,
                                top: '50%',
                                transform: 'translateY(-50%)',
                                color: '#a259e6',
                                fontSize: 20,
                                pointerEvents: 'none'
                            }}>
                                <svg width="20" height="20" fill="currentColor" style={{ marginLeft: 2 }}>
                                    <path d="M17 8V6a5 5 0 0 0-10 0v2a2 2 0 0 0-2 2v6a2 2 0 0 0 2 2h10a2 2 0 0 0 2-2v-6a2 2 0 0 0-2-2zm-8-2a3 3 0 0 1 6 0v2H9V6zm8 10H3v-6h14v6zm-7-3a1 1 0 1 1 2 0 1 1 0 0 1-2 0z"/>
                                </svg>
                            </span>
                            <input
                                type="password"
                                name="senha"
                                placeholder="Password"
                                value={form.senha}
                                onChange={handleChange}
                                required
                                style={{
                                    width: '100%',
                                    padding: '10px 10px 10px 32px',
                                    border: 'none',
                                    borderBottom: '2px solid #3a2e5c',
                                    background: 'transparent',
                                    color: '#fff',
                                    fontSize: 16,
                                    outline: 'none'
                                }}
                            />
                        </div>
                        {/* Botão */}
                        <button
                            type="submit"
                            style={{
                                width: '100%',
                                padding: '12px 0',
                                borderRadius: 24,
                                border: '2px solid #e4105d',
                                background: 'linear-gradient(90deg, #e4105d 0%, #ff7a29 100%)',
                                color: '#fff',
                                fontWeight: 700,
                                fontSize: '1.1rem',
                                cursor: 'pointer',
                                marginTop: '10px',
                                marginBottom: '8px',
                                boxShadow: '0 2px 8px 0 #e4105d33'
                            }}
                        >
                            Criar minha conta
                        </button>
                        {/* Termos */}
                        <div style={{
                            fontSize: '0.95rem',
                            color: '#b2b2c2',
                            marginBottom: 8
                        }}>
                            Ao clicar em "criar minha conta grátis",<br />
                            declaro que aceito as Políticas de Privacidade e os Termos de Uso da DIO.
                        </div>
                        {/* Link login */}
                        <div style={{
                            fontSize: '1rem',
                            color: '#fff',
                            marginTop: 0
                        }}>
                            <span style={{ color: '#b2b2c2', fontWeight: 700 }}>Já tenho conta. </span>
                            <a href="#" style={{ color: '#00e88f', fontWeight: 700, textDecoration: 'none' }}>Fazer login</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    );
}