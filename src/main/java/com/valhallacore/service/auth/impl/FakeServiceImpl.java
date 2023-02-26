package com.valhallacore.service.auth.impl;

import com.valhallacore.entity.auth.Role;
import com.valhallacore.entity.bo.ProductCategoryEntity;
import com.valhallacore.entity.bo.ProductEntity;
import com.valhallacore.entity.bo.ProductImageEntity;
import com.valhallacore.repository.auth.RoleRepository;
import com.valhallacore.repository.bo.ProductCategoryEntityRepository;
import com.valhallacore.repository.bo.ProductEntityRepository;
import com.valhallacore.repository.bo.ProductImageEntityRepository;
import com.valhallacore.service.auth.FakeService;
import lombok.RequiredArgsConstructor;
import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FakeServiceImpl implements FakeService {
    private final ProductEntityRepository productEntityRepository;
    private final ProductImageEntityRepository productImageEntityRepository;
    private final Faker dataFaker = new Faker();
    private final ProductCategoryEntityRepository productCategoryEntityRepository;
    private final RoleRepository roleRepository;

    public void saveFakeProduct() {
        List<String> imgUrl = new ArrayList<>();
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader.jpg?alt=media&token=80675a00-85d9-4df0-8406-fef803d56376");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20-%202023-02-24T134557.218.jpg?alt=media&token=5ff9ad02-0a4b-4ca9-9b9a-0fb9c3b9dbd4");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20-%202023-02-24T134551.657.jpg?alt=media&token=82e918da-6e69-4e06-8681-bd452b4db994");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20-%202023-02-24T134548.438.jpg?alt=media&token=eb46a62f-95ef-4a3c-98b7-93d3983793bf");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20-%202023-02-24T134545.351.jpg?alt=media&token=e9defb59-7c32-44c4-b7b8-707e17628a66");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(99).jpg?alt=media&token=8c53de58-3920-4726-a3e0-7c6fdfe0f9be");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(98).jpg?alt=media&token=38942ee6-8260-4f40-b572-12f677fa9c79");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(97).jpg?alt=media&token=d9b6fd63-42ff-4e12-9fd4-bf4a8ce32ad1");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(96).jpg?alt=media&token=0bf3b034-739d-4b7e-9149-8d822b287b15");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(95).jpg?alt=media&token=59ec999b-a376-4d8c-b9d5-b44362462f26");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(94).jpg?alt=media&token=e9655da8-baa9-42bf-a37d-de841a366371");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(93).jpg?alt=media&token=42bb2276-d010-4490-972f-e0911c64d44b");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(92).jpg?alt=media&token=da74c853-e42e-40db-9983-c9aa6ef8e995");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(91).jpg?alt=media&token=72be852d-9bc0-42d4-926a-be04c7735639");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(90).jpg?alt=media&token=f6c39fbe-e925-4156-9263-f1646d290a4e");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(9).jpg?alt=media&token=1c8de3ea-2030-46fa-866b-647eb1317490");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(89).jpg?alt=media&token=1d1a1ac2-e649-4f40-964f-d29be21ebece");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(88).jpg?alt=media&token=bbb2272c-2797-4097-b5db-4c7b823b62ab");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(87).jpg?alt=media&token=dfc1d2fd-b051-4f1b-af30-a6d4e20312fd");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(86).jpg?alt=media&token=0766a77f-4e8e-4820-902c-ef62bf9f9091");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(85).jpg?alt=media&token=62f1392d-fd45-4088-b80f-cadc0c9f789b");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(84).jpg?alt=media&token=48abb3a6-c5cd-44fe-a27c-8ff57f3f3f84");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(83).jpg?alt=media&token=29a545fb-8264-444b-8552-8e86b09846ca");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(82).jpg?alt=media&token=40aeeb26-d1f5-4025-a2d8-ad28eab9d62f");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(81).jpg?alt=media&token=acf495b7-248a-4f30-87d5-d02d213b7ae3");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(80).jpg?alt=media&token=aedc48db-cc67-4395-9792-81a59204a4ad");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(8).jpg?alt=media&token=ccc8991c-ff65-4d53-a0d3-c28b26d38830");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(79).jpg?alt=media&token=a8d047bb-177a-40db-b285-417f315f8dfe");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(78).jpg?alt=media&token=97607e0e-ba99-4a2d-9958-09bfff1eea9e");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(77).jpg?alt=media&token=c00360d8-40f6-462b-b20c-5d025ac4d780");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(76).jpg?alt=media&token=f422aaea-b02a-4bcc-8a9d-0d05589e0279");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(75).jpg?alt=media&token=8d759247-42f3-42a8-b6b5-482b7e548b95");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(74).jpg?alt=media&token=063ce5f9-8dff-44ff-8d18-020b6e3663e2");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(73).jpg?alt=media&token=aff99853-f137-4391-bc09-9f47ba509eaf");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(72).jpg?alt=media&token=6b1ba517-8c09-49d6-a4ca-ab9219e3d87a");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(71).jpg?alt=media&token=c3531e56-6f50-4b69-bb98-02ec53572009");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(70).jpg?alt=media&token=4ebe14e5-de3a-468c-8d65-9a77b1b546a6");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(7).jpg?alt=media&token=3794227d-f40d-42e7-9cfc-649f278a03db");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(69).jpg?alt=media&token=d7a7f8d5-f055-4883-a0d3-fe26d38fe75f");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(68).jpg?alt=media&token=849bdebc-1c4c-4330-a3da-c885d869a8f9");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(67).jpg?alt=media&token=e2e5860b-35a8-4a81-a50a-ac5ef1a146e7");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(66).jpg?alt=media&token=aea9b24d-bfd7-4d3a-bd66-68531f529899");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(65).jpg?alt=media&token=f710f0aa-7d5a-4e11-81a9-b0cb8599c214");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(64).jpg?alt=media&token=83561ba0-ff51-49a1-9410-2220edcc3eb7");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(63).jpg?alt=media&token=fcb45e5e-0ba6-4357-bf27-35a8ee5d5e41");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(62).jpg?alt=media&token=e68d7f77-c31d-473f-96df-0f5204f296de");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(61).jpg?alt=media&token=49d00c06-e593-4775-9d8b-0321f30652b4");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(60).jpg?alt=media&token=20752817-f317-45dd-a7a1-16a4aa663bdf");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(6).jpg?alt=media&token=66de1a81-6096-4ea6-8e60-e0034deb5d7d");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(59).jpg?alt=media&token=88a3a7f0-da04-44f3-a96c-d8f2a9084f9e");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(58).jpg?alt=media&token=bc679cf1-810c-4277-a80b-cd1f7d6e28d5");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(57).jpg?alt=media&token=f8a080be-68a3-402b-8ef9-1fe267a10ab5");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(56).jpg?alt=media&token=674b3125-84a0-4ccb-92f8-3cee2d1a9b35");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(55).jpg?alt=media&token=685d2b3e-5a1a-41cc-94f3-aff69001bed7");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(54).jpg?alt=media&token=9ca57af5-d994-4342-89a5-5f1bcd81cef2");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(53).jpg?alt=media&token=8c5b1a1a-9c88-44f4-a968-a3265a444ec9");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(52).jpg?alt=media&token=5e75d047-5d6b-4e38-9f2b-361bfabe53f0");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(51).jpg?alt=media&token=112bb0bb-4c44-4811-96d6-6dfcd593120f");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(50).jpg?alt=media&token=843ca1b2-970f-4d3e-949c-13828bcbb95f");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(5).jpg?alt=media&token=f961487e-690c-4033-b2f9-739dd695bf63");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(49).jpg?alt=media&token=ff5d1ee9-c686-41af-aaa6-57a0f79917a3");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(48).jpg?alt=media&token=4bdab6f0-0b3a-44c6-9e6c-f3687fd74936");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(47).jpg?alt=media&token=496acc39-d817-4a3a-8311-b2a1b2ef51af");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(46).jpg?alt=media&token=46abc37f-9f8c-4350-8fd0-93e6932b62f1");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(45).jpg?alt=media&token=192ed288-4334-4aa7-aedf-33c59a73a885");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(44).jpg?alt=media&token=25316d60-8618-4f62-a741-d9a7674a5ded");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(43).jpg?alt=media&token=1d2de10b-9d7b-4dc1-9505-2f1e7e3364e2");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(42).jpg?alt=media&token=ce55bb4a-4c4f-4cb8-bff0-56b40a76b15f");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(41).jpg?alt=media&token=a353942f-a5fb-498b-a174-85e54884da72");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(40).jpg?alt=media&token=9fe547a9-400b-46d4-9d30-ee9f983937c5");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(4).jpg?alt=media&token=20a711ae-4e09-4d68-b8e2-36b0f8fab208");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(39).jpg?alt=media&token=6fca377d-0753-4434-820d-89fb2e5cbe8e");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(38).jpg?alt=media&token=29e6ed85-8317-41a9-b791-1065f68731d8");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(37).jpg?alt=media&token=a9d65622-780c-4824-952b-5aafb30abed0");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(36).jpg?alt=media&token=51535df9-a1f2-484a-be3b-1616a1f51ea3");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(35).jpg?alt=media&token=a4d0932e-858d-4770-af57-5ad5acf30dcd");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(34).jpg?alt=media&token=1294390e-c35c-48f9-9d86-8a25e9c3dc2e");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(33).jpg?alt=media&token=31fa4325-eed4-4a81-a87c-958d9b540683");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(32).jpg?alt=media&token=58093c41-e593-4b3f-ac06-509182a97014");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(31).jpg?alt=media&token=3ac628a0-99c1-4501-898b-d542467e2e1c");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(30).jpg?alt=media&token=420aa270-3820-485f-b7ff-9bf1f631839f");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(3).jpg?alt=media&token=f2b665b6-f019-4ee7-b6eb-607e442437b4");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(29).jpg?alt=media&token=c82f777b-c09f-4568-8bb6-d23f4711919e");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(28).jpg?alt=media&token=76663c98-4900-40ac-b855-a6a15137005b");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(27).jpg?alt=media&token=e9dad603-3664-488b-a621-1a53494d9331");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(26).jpg?alt=media&token=256fdafb-13e9-4c64-96fc-1486853d7e4f");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(25).jpg?alt=media&token=14c235c6-df47-410f-aca2-9825f949c67d");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(24).jpg?alt=media&token=ef6fa462-af4b-41f2-83d8-424714620033");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(23).jpg?alt=media&token=a5e2a98e-d479-4d96-9822-99cb58871c73");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(22).jpg?alt=media&token=bd3bf2c3-c0c0-4667-bf01-27fd2bbb62cf");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(21).jpg?alt=media&token=f1c5dda3-125e-4db7-9102-4473f9c8334a");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(20).jpg?alt=media&token=c1d02045-a024-405c-b72f-f2039df717ee");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(2).jpg?alt=media&token=351a5a13-f7ff-47bb-a0ea-7830efac3af4");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(19).jpg?alt=media&token=d011a108-b612-43f9-bff9-b16aff27051a");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(18).jpg?alt=media&token=374d2ef9-dfd7-4ba6-a76e-3749851c96aa");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(17).jpg?alt=media&token=94334c75-46d6-436f-ac84-ad4f9567e251");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(16).jpg?alt=media&token=743785c0-4457-476b-8332-c1177b6e2880");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(15).jpg?alt=media&token=4a0edf51-ba18-439b-8437-5a53e2963a46");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(14).jpg?alt=media&token=3a1a1a48-612a-4389-9370-a19c65265784");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(13).jpg?alt=media&token=4f23e435-bb31-4fda-9b3b-7d1d54a10485");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(12).jpg?alt=media&token=72ac4640-e9d8-45e6-8551-329598ebddc5");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(11).jpg?alt=media&token=8fcd6c6b-65b0-4c24-a5ae-c34748ff34ef");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(100).jpg?alt=media&token=83f10cca-8140-4a0b-9cee-e3cb06741487");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(10).jpg?alt=media&token=31eeba04-4bfa-440f-86f9-29e28c14ee02");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fheader%20(1).jpg?alt=media&token=79922eda-b254-44fd-b320-dfa3634be8b9");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fgtaprev.jpg?alt=media&token=ef271917-ae4b-407d-afb5-796377f16675");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2Fdyinglightechane.png?alt=media&token=827fadf5-96cb-4139-b377-a11fa4bd4532");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2F51fGrVeBBrL-36933.jpg?alt=media&token=60f62e0a-e275-46b1-ad9e-38bc4759ada2");
        imgUrl.add("https://firebasestorage.googleapis.com/v0/b/valhallagames-shop.appspot.com/o/product%2Fimage%2FFLLHdLMXEAEjPFX-98380.jpg?alt=media&token=13b3d26e-0509-4ce1-92ff-eed45f7c8001");

        List<Role> roles = new ArrayList<>();
        roles.add(Role.builder()
                .name("ROLE_CUSTOMER")
                .build());
        roles.add(Role.builder()
                .name("ROLE_ADMIN")
                .build());
        roles.add(Role.builder()
                .name("ROLE_EMPLOYEE")
                .build());
        roles.add(Role.builder()
                .name("ROLE_MANAGER")
                .build());

        roleRepository.saveAll(roles);

        for (int i = 0; i < 20; i++) {
            ProductCategoryEntity productCategoryEntity = ProductCategoryEntity.builder()
                    .name(this.dataFaker.esports().game())
                    .build();
            productCategoryEntityRepository.save(productCategoryEntity);
        }

        for (int i = 0; i < 109; i++) {
            ProductEntity product = ProductEntity.builder()
                    .name(this.dataFaker.leagueOfLegends().champion())
                    .description("None")
                    .quantity(this.dataFaker.number().numberBetween(15, 20))
                    .quantityAvailable(this.dataFaker.number().numberBetween(1, 15))
                    .originalPrice(this.dataFaker.number().randomDouble(3, 10, 10000))
                    .discountPercentage(this.dataFaker.number().randomDouble(2, 0, 50))
                    .category(ProductCategoryEntity.builder().id(this.dataFaker.number().numberBetween(1L, 20L)).build())
                    .build();

            // Save product and return id to product
            product = productEntityRepository.save(product);
            productEntityRepository.flush();

            ProductImageEntity productImage = ProductImageEntity.builder()
                    .product(product)
                    .url(imgUrl.get(i))
                    .build();
            productImageEntityRepository.save(productImage);
        }
    }
}
