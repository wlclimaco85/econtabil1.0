package com.nouhoun.springboot.jwt.integration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController extends BaseController {
	private static Logger LOG = LoggerFactory.getLogger(LoginController.class);

	//private @Autowired UserService userService;
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String login() {
		
		return "index";
	}
	
	@RequestMapping(value = { "/header" }, method = RequestMethod.GET)
	public String header() {
		
		return "header";
	}
	
	@RequestMapping(value = { "/nav" }, method = RequestMethod.GET)
	public String nav() {
		
		return "nav";
	}
//	private @Autowired MailJobService mailJobService;

//
//	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
//	public String login() {
//		LOG.debug("Single file upload!");
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("index");
//		ModelMap modal = new ModelMap();
//		modal.addAttribute("title","CRUD Example");
//        return "index";
//        
//	//	return modelAndView;
//	}
//
//	@CrossOrigin(origins = "*")
//	@RequestMapping(value = "/authenticate", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody APIResponse authenticater(@RequestBody UserDTO userDTO, HttpServletRequest request,
//			HttpServletResponse response) throws NoSuchPaddingException, NoSuchAlgorithmException,
//			InvalidKeySpecException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException,
//			IllegalBlockSizeException, UnsupportedEncodingException {
//		Validate.isTrue(StringUtils.isNotBlank(userDTO.getUsername()), "Email is blank");
//		Validate.isTrue(StringUtils.isNotBlank(userDTO.getPassword()), "Encrypted password is blank");
//		String password = decryptPassword(userDTO);
//
//		LOG.info("Looking for user by email: " + userDTO.getUsername());
//		User user = userService.findUserByEmail(userDTO.getUsername());
//
//		HashMap<String, Object> authResp = new HashMap<String, Object>();
//		if (userService.isValidPass(user, password)) {
//			LOG.info("User authenticated: " + user.getUsername());
//			userService.loginUser(user, request);
//			createAuthResponse(user, authResp);
//		} else {
//			//throw new AuthenticationFailedException("Invalid username/password combination");
//		}
//
//		return APIResponse.toOkResponse(authResp);
//	}
//
//	@CrossOrigin(origins = "*")
//	@RequestMapping(value = "/login", method = RequestMethod.GET, headers = { JSON_API_CONTENT_HEADER })
//	public @ResponseBody APIResponse authenticate(@RequestBody UserDTO userDTO, HttpServletRequest request,
//			HttpServletResponse response) throws NoSuchPaddingException, NoSuchAlgorithmException,
//			InvalidKeySpecException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException,
//			IllegalBlockSizeException, UnsupportedEncodingException {
//		Validate.isTrue(StringUtils.isNotBlank(userDTO.getUsername()), "Email is blank");
//		Validate.isTrue(StringUtils.isNotBlank(userDTO.getPassword()), "Encrypted password is blank");
//		String password = decryptPassword(userDTO);
//
//		LOG.info("Looking for user by email: " + userDTO.getUsername());
//		User user = userService.findUserByEmail(userDTO.getUsername());
//
//		HashMap<String, Object> authResp = new HashMap<String, Object>();
//		if (userService.isValidPass(user, password)) {
//			LOG.info("User authenticated: " + user.getUsername());
//			userService.loginUser(user, request);
//			createAuthResponse(user, authResp);
//		} else {
//		//	throw new AuthenticationFailedException("Invalid username/password combination");
//		}
//
//		return APIResponse.toOkResponse(authResp);
//	}
//
//	@CrossOrigin(origins = "*")
//	@RequestMapping(value = "/registration", method = RequestMethod.POST , produces=MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody APIResponse submitJob(@RequestBody String userString, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//
//		ObjectMapper mapper = new ObjectMapper();
//		UserDTO user = mapper.readValue(userString, UserDTO.class);
//		Validate.isTrue(StringUtils.isNotBlank(user.getUsername()), "Email is blank");
//		Validate.isTrue(StringUtils.isNotBlank(user.getPassword()), "Encrypted password is blank");
//		String password = decryptPassword(user);
//
//		User userExists = userService.findUserByEmail(user.getUsername());
//		if (userExists != null) {
//			return null;
//		}
//		String role = "ADMIN";
//		if(user.getIsDono() == 1)
//		{
//			role = "EMPRESA";
//		}		
//		User users = new User();
//		userService.saveUser(users);
//		
//		HashMap<String, Object> authResp = new HashMap<String, Object>();
//		//if (userService.isValidPass(users, password)) {
//		//	LOG.info("User authenticated: " + user.getUsername());
//		//	userService.loginUser(users, request);
//			createAuthResponse(users, authResp);
//		//} else {
//		//	throw new AuthenticationFailedException("Invalid username/password combination");
//		//}
//
//		return APIResponse.toOkResponse(authResp);
//	}
//
//	@RequestMapping(value = "/logins", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<User> home(String email, HttpServletRequest request, HttpServletResponse response) {
//		ModelAndView modelAndView = new ModelAndView();
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.findUserByEmail(email);
//		LOG.info("User authenticated: " + email);
//		userService.loginUser(user, request);
//		modelAndView.addObject("userName",
//				"Welcome " + user.getUsername() + " " + user.getLastName() + " (" + user.getUsername() + ")");
//		modelAndView.addObject("adminMessage", "Content Available Only for Users with Admin Role");
//		modelAndView.setViewName("admin/home");
//		return new ResponseEntity<User>(user, HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/admin/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody APIResponse authenticates(String password, String encryptedPassword, String email, String salt,
//			String iv, int keySize, int iterations, String vpassword, HttpServletRequest request,
//			HttpServletResponse response) throws NoSuchPaddingException, NoSuchAlgorithmException,
//			InvalidKeySpecException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException,
//			IllegalBlockSizeException, UnsupportedEncodingException {
//		//
//
//		UserDTO userDTO = new UserDTO(email, password, iv, salt, keySize, iterations,encryptedPassword);
//		// UserDTO userDTO = new UserDTO();
//		Validate.isTrue(StringUtils.isNotBlank(userDTO.getUsername()), "Email is blank");
//		Validate.isTrue(StringUtils.isNotBlank(userDTO.getEncryptedPassword()), "Encrypted password is blank");
//		String passwords = decryptPassword(userDTO);
//
//		LOG.info("Looking for user by email: " + userDTO.getUsername());
//		User user = userService.findUserByEmail(userDTO.getUsername());
//
//		HashMap<String, Object> authResp = new HashMap<String, Object>();
//		if (userService.isValidPass(user, passwords)) {
//			LOG.info("User authenticated: " + user.getUsername());
//			userService.loginUser(user, request);
//			createAuthResponse(user, authResp);
//		} else {
//		//	throw new AuthenticationFailedException("Invalid username/password combination");
//		}
//
//		return APIResponse.toOkResponse(authResp);
//	}
//
//	private String decryptPassword(UserDTO userDTO) throws NoSuchPaddingException, NoSuchAlgorithmException,
//			InvalidAlgorithmParameterException, InvalidKeyException, InvalidKeySpecException, BadPaddingException,
//			IllegalBlockSizeException, UnsupportedEncodingException {
//		String passPhrase = "biZndDtCMkdeP8K0V15OKMKnSi85";
//		String salt = userDTO.getSalt();
//		String iv = userDTO.getIv();
//		int iterationCount = userDTO.getIterations();
//		int keySize = userDTO.getKeySize();
//
//		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//		SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
//		KeySpec spec = new PBEKeySpec(passPhrase.toCharArray(), hex(salt), iterationCount, keySize);
//		SecretKey key = new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
//
//		cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(hex(iv)));
//		byte[] decrypted = cipher.doFinal(base64(userDTO.getEncryptedPassword()));
//
//		return new String(decrypted, "UTF-8");
//	}
//
//	private String base64(byte[] bytes) {
//		return Base64.encodeBase64String(bytes);
//	}
//
//	private byte[] base64(String str) {
//		return Base64.decodeBase64(str);
//	}
//
//	private String hex(byte[] bytes) {
//		return Hex.encodeHexString(bytes);
//	}
//
//	private byte[] hex(String str) {
//		try {
//			return Hex.decodeHex(str.toCharArray());
//		} catch (DecoderException e) {
//			throw new IllegalStateException(e);
//		}
//	}
//
//	private void createAuthResponse(User user, HashMap<String, Object> authResp) {
////		String token = Jwts.builder().setSubject(user.getUsername()).claim("role", user.getRoles()).setIssuedAt(new Date())
////				.signWith(SignatureAlgorithm.HS256, JWTTokenAuthFilter.JWT_KEY).compact();
//		authResp.put("token", "");
//		authResp.put("user", user); 
//	}

}
